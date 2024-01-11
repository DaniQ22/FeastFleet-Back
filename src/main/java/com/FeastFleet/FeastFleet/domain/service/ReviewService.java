package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.domain.validation.ReviewValidation;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.RestaurantRepository;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.ReviewRepository;
import com.FeastFleet.FeastFleet.web.message.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements ReviewServiceInter{

    private final ReviewRepository repository;

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public ReviewService(ReviewRepository repository, RestaurantRepository restaurantRepository) {
        this.repository = repository;
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Review> getAll(String restaurantId) {
        return  repository.getAll(restaurantId);
    }

    @Override
    public List<Review> getAllReview() {
        return repository.getAllReview();
    }

    @Override
    public Review save(Review review) {
        Optional<Restaurant> restaurant = restaurantRepository.getById(review.getRestaurantId());
        if (restaurant.isEmpty()){
            throw  new MessageException("El restaurante no existe");
        }
        ReviewValidation.validationSaveReview(review);

        return repository.save(review);
    }


    @Override
    public Optional<Review> getById(Integer reviewId) {
        return repository.getById(reviewId);
    }

    @Override
    public void delete(Integer reviewId) {
        Optional<Review> reviewToDelete = getById(reviewId);

        if (reviewToDelete.isPresent()){
            repository.delete(reviewId);
        }else {
            throw new MessageException("La reseña no existe");
        }
    }

    @Override
    public List<Review> getReviewByCustomer(String customerId) {
        return repository.getreviewByCustomer(customerId);
    }
}
