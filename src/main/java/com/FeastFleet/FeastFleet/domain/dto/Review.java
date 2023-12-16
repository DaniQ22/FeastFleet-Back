package com.FeastFleet.FeastFleet.domain.dto;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import lombok.Getter;
import lombok.Setter;


public class Review {

    private int reviewId;

    private String userId;

    private String restaurantId;

    private String comment;

    private double qualification;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
}
