package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;

import java.util.List;
import java.util.Optional;

public interface ReservationRepositoryConfirmInter {


    List<ReservationConfirm> getAll();

    Optional<ReservationConfirm> getById(Integer id);

    ReservationConfirm save(ReservationConfirm reservationConfirm);

    void delete(Integer id);

}
