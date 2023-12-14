package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.ReservaCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Reserva;
import com.FeastFleet.FeastFleet.persistence.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepository implements ReservationRepositoryInter {

    private final ReservaCrud reservaCrud;
    private final ReservationMapper reservationMapper;

    @Autowired
    public ReservationRepository(ReservaCrud reservaCrud, ReservationMapper reservationMapper) {
        this.reservaCrud = reservaCrud;
        this.reservationMapper = reservationMapper;
    }

    @Override
    public List<Reservation> getAll() {
        List<Reserva> reservas = reservaCrud.findAll();
        return reservationMapper.toReservations(reservas);
    }
}
