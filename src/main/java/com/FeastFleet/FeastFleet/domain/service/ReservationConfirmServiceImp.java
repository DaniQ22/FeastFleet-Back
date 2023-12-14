package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryConfirmInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
