package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.domain.repository.ReviewRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.ResenaCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Resena;
import com.FeastFleet.FeastFleet.persistence.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReviewRepository implements ReviewRepositoryInter {
    private final ResenaCrud crud;

    private final ReviewMapper mapper;

    @Autowired
    public ReviewRepository(ResenaCrud crud, ReviewMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }


    @Override
    public List<Review> getAll(String restaurandId) {
        List reviews = crud.getReviewsByRestaurant(restaurandId);
        return mapper.toReview(reviews);
    }

    @Override
    public Review save(Review review) {
        Resena resena = mapper.toResena(review);
        return mapper.toReviwe(crud.save(resena));
    }

    @Override
    public Optional<Review> getById(Integer reviewId) {
        Optional<Resena> resena = crud.findById(reviewId);
        return resena.map(rev -> mapper.toReviwe(rev));
    }

    @Override
    public void delete(Integer reviewId) {
        crud.deleteById(reviewId);
    }

}
