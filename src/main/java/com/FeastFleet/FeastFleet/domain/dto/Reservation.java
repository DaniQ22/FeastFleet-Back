package com.FeastFleet.FeastFleet.domain.dto;


import java.time.LocalDateTime;

public class Reservation {

    private Integer idReservation;
    private LocalDateTime date;
    private Integer comensNumber;

    private String restaurantId;

    private String customerId;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getComensNumber() {
        return comensNumber;
    }

    public void setComensNumber(Integer comensNumber) {
        this.comensNumber = comensNumber;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
