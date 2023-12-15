package com.FeastFleet.FeastFleet.domain.dto;

public class ImgRestaurant {

    private int imageId;

    private String name;

    private String contentTipe;

    private Byte[] date;

    private String restaurantId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentTipe() {
        return contentTipe;
    }

    public void setContentTipe(String contentTipe) {
        this.contentTipe = contentTipe;
    }

    public Byte[] getDate() {
        return date;
    }

    public void setDate(Byte[] date) {
        this.date = date;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
