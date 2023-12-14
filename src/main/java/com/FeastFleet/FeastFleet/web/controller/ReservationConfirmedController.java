package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.domain.service.ReservationConfirmService;
import com.FeastFleet.FeastFleet.domain.service.ReservationConfirmServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservationconfirmed")
public class ReservationConfirmedController {

    private final ReservationConfirmService reservationConfirmService;

    public ReservationConfirmedController(ReservationConfirmService reservationConfirmService) {
        this.reservationConfirmService = reservationConfirmService;
    }

    @GetMapping("/all")
    public List<ReservationConfirm> getAll(){
        return reservationConfirmService.getAll();
    }

}
