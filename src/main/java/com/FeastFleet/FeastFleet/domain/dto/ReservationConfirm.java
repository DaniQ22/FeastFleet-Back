package com.FeastFleet.FeastFleet.domain.dto;



import java.time.LocalDateTime;

public class ReservationConfirm {

    private Integer confirmedReservationId;

    private Integer reservationId;
    private Integer confirmatedCode;
    private LocalDateTime confirmatedDate;


    public Integer getConfirmedReservationId() {
        return confirmedReservationId;
    }

    public void setConfirmedReservationId(Integer confirmedReservationId) {
        this.confirmedReservationId = confirmedReservationId;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
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
