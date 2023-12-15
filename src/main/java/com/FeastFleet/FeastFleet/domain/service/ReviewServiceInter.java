package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Review;

import java.util.List;

public interface ReviewServiceInter {

    List<Review> getAll();

    Review save(Review review);
}
