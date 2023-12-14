package com.FeastFleet.FeastFleet.domain.dto;



import java.time.LocalDateTime;

public class ReservationConfirm {

    private Integer confirmedReservationId;
    private String usuarioId;
    private String restaurantId;
    private Integer confirmatedCode;
    private LocalDateTime confirmatedDate;


    public Integer getConfirmedReservationId() {
        return confirmedReservationId;
    }

    public void setConfirmedReservationId(Integer confirmedReservationId) {
        this.confirmedReservationId = confirmedReservationId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getConfirmatedCode() {
        return confirmatedCode;
    }

    public void setConfirmatedCode(Integer confirmatedCode) {
        this.confirmatedCode = confirmatedCode;
    }

    public LocalDateTime getConfirmatedDate() {
        return confirmatedDate;
    }

    public void setConfirmatedDate(LocalDateTime confirmatedDate) {
        this.confirmatedDate = confirmatedDate;
    }
}
