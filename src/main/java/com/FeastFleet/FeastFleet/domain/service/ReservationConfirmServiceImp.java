package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryConfirmInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationConfirmServiceImp implements ReservationConfirmService{

    private final ReservationRepositoryConfirmInter reservationRepositoryConfirmInter;

    @Autowired
    public ReservationConfirmServiceImp(ReservationRepositoryConfirmInter reservationRepositoryConfirmInter) {
        this.reservationRepositoryConfirmInter = reservationRepositoryConfirmInter;
    }


    @Override
    public List<ReservationConfirm> getAll() {
        return reservationRepositoryConfirmInter.getAll();
    }

    @Override
    public Optional<ReservationConfirm> getById(Integer id) {
        return reservationRepositoryConfirmInter.getById(id);
    }

    @Override
    public ReservationConfirm save(ReservationConfirm reservationConfirm) {
        return reservationRepositoryConfirmInter.save(reservationConfirm);
    }

    @Override
    public void delete(Integer id) {
      reservationRepositoryConfirmInter.delete(id);
    }
}
