package com.FeastFleet.FeastFleet.domain.dto;


import java.util.List;

public class Restaurant {

    private String restaurantId;
    private String name;
    private String cookType;
    private String address;
    private String description;

    private float calification;

    private List<ImgRestaurant> image;

    private List<CategoryRestaurant> categories;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCookType() {
        return cookType;
    }

    public void setCookType(String cookType) {
        this.cookType = cookType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<ImgRestaurant> getImage() {
        return image;
    }

    public void setImage(List<ImgRestaurant> image) {
        this.image = image;
    }

    public List<CategoryRestaurant> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryRestaurant> categories) {
        this.categories = categories;
    }

    public float getCalification() {
        return calification;
    }

    public void setCalification(float calification) {
        this.calification = calification;
    }
}
