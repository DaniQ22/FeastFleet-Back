package com.FeastFleet.FeastFleet.domain.dto;

import com.FeastFleet.FeastFleet.persistence.entity.ReservaPK;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;


import java.time.LocalDateTime;

public class Reservation {

    private String idRestaurant;
    private LocalDateTime date;
    private Integer comensNumber;


    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
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
}
