package com.FeastFleet.FeastFleet.domain.dto;

import com.sun.source.doctree.SeeTree;

public class ImgRestaurant {

    private String imageUrl;

    private String restaurantId;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
