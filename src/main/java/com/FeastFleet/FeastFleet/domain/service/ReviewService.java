package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.RestaurantRepository;
import com.FeastFleet.FeastFleet.persistence.repositoryIMP.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Review> getAll() {
        return  repository.getAll();
    }

    @Override
    public Review save(Review review) {
        return repository.save(review);
    }
}
