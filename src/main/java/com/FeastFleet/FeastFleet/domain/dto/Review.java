package com.FeastFleet.FeastFleet.domain.dto;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import lombok.Getter;
import lombok.Setter;


public class Review {

    private int reviewId;

    private String customerId;

    private String restaurantId;

    private String comment;

    private double qualification;


    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

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
}
