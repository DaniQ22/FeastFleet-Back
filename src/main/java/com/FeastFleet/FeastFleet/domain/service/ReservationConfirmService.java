package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;

import java.util.List;
import java.util.Optional;

public interface ReservationConfirmService {

    List<ReservationConfirm> getAll();

    Optional<ReservationConfirm> getById(Integer id);

    ReservationConfirm save(ReservationConfirm reservationConfirm);

    void delete(Integer id);
}
