package com.FeastFleet.FeastFleet.domain.dto;


import java.time.LocalDateTime;

public class Reservation {

    private Integer idReservation;
    private LocalDateTime date;
    private Integer comensNumber;


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
}
