package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface ReviewServiceInter {

    List<Review> getAll(String restaurantId);

    List<Review> getAllReview();

    Review save(Review review);

    Optional<Review> getById(Integer reviewId);

    void delete(Integer reviewId);

    List<Review> getReviewByCustomer(String customerId);

}
