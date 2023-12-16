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

    @Override
    public Optional<Reservation> getById(Integer id) {
        return reservationRepositoryInter.getById(id);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepositoryInter.save(reservation);
    }

    @Override
    public void delete(Integer id) {
      reservationRepositoryInter.delete(id);
    }


}
