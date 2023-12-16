package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.dto.Restaurant;

import java.util.List;
import java.util.Optional;

public interface ReservationServiceInter {

    List<Reservation> getAll();

    Optional<Reservation> getById(Integer id);

    Reservation save(Reservation reservation);

    void delete(Integer id);

}
