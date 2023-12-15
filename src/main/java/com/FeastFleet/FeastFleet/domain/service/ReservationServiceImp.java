package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImp implements ReservationServiceInter{

    private final ReservationRepositoryInter reservationRepositoryInter;

    @Autowired
    public ReservationServiceImp(ReservationRepositoryInter reservationRepositoryInter) {
        this.reservationRepositoryInter = reservationRepositoryInter;
    }


    @Override
    public List<Reservation> getAll() {
        return reservationRepositoryInter.getAll();
    }


}
