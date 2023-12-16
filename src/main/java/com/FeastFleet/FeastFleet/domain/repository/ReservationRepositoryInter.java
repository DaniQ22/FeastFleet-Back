package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepositoryInter {

    List<Reservation> getAll();

    Optional<Reservation> getById(Integer id);

    Reservation save(Reservation reservation);

    void delete(Integer id);

    
}
