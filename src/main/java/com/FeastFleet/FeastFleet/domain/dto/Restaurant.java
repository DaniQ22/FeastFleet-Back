package com.FeastFleet.FeastFleet.domain.dto;


public class Restaurant {

    private String restaurantId;
    private String name;
    private String cookType;
    private String address;
    private String description;
    private Float calification;



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

    public void setCookType(String cookTipe) {
        this.cookType = cookTipe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addres) {
        this.address = addres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCalification() {
        return calification;
    }

    public void setCalification(Float calification) {
        this.calification = calification;
    }
}
