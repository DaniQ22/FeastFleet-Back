package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.persistence.entity.Resena;

import java.util.List;
import java.util.Optional;

public interface ReviewRepositoryInter {

    List<Review> getAll(String restaurantId);

    List<Review> getAllReview();

    Review save(Review review);


    Optional<Review> getById(Integer reviewId);

    void delete(Integer reviewId);

    List<Review> getreviewByCustomer(String customerId);


}
