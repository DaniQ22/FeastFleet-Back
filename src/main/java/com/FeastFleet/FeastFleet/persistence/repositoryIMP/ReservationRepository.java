package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.ReservaCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Reserva;
import com.FeastFleet.FeastFleet.persistence.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Reservation> getById(Integer id) {
        return reservaCrud.findById(id).map(reservationMapper::toReservation);
    }

    @Override
    public Reservation save(Reservation reservation) {
        Reserva reserva = reservationMapper.toReserva(reservation);
        return reservationMapper.toReservation(reservaCrud.save(reserva));
    }

    @Override
    public void delete(Integer id) {
      reservaCrud.deleteById(id);
    }
}
