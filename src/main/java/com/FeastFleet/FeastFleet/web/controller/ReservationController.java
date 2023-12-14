package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.service.ReservationServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    private final ReservationServiceInter reservationServiceInter;

    @Autowired
    public ReservationController(ReservationServiceInter reservationServiceInter) {
        this.reservationServiceInter = reservationServiceInter;
    }

    @GetMapping("/all")
    List<Reservation> getAll(){
        return reservationServiceInter.getAll();
    }




}
