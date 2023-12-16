package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.domain.repository.ReservationRepositoryConfirmInter;
import com.FeastFleet.FeastFleet.persistence.crud.ReservaConfirmadaCrud;
import com.FeastFleet.FeastFleet.persistence.entity.ReservaConfirmada;
import com.FeastFleet.FeastFleet.persistence.mapper.ReservationConfirmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationConfirmedRepository implements ReservationRepositoryConfirmInter {

    private final ReservationConfirmMapper reservationConfirmMapper;
    private final ReservaConfirmadaCrud reservaConfirmadaCrud;

    @Autowired
    public ReservationConfirmedRepository(ReservationConfirmMapper reservationConfirmMapper, ReservaConfirmadaCrud reservaConfirmadaCrud) {
        this.reservationConfirmMapper = reservationConfirmMapper;
        this.reservaConfirmadaCrud = reservaConfirmadaCrud;
    }


    @Override
    public List<ReservationConfirm> getAll() {
        List<ReservaConfirmada> reservaConfirmadas = reservaConfirmadaCrud.findAll();
        return reservationConfirmMapper.toReservartionsConfirms(reservaConfirmadas);
    }

    @Override
    public Optional<ReservationConfirm> getById(Integer id) {
        return reservaConfirmadaCrud.findById(id).map(reservationConfirmMapper::toReservartionConfirm);
    }

    @Override
    public ReservationConfirm save(ReservationConfirm reservationConfirm) {
        ReservaConfirmada reservaConfirmada = reservationConfirmMapper.toReservaConfirmada(reservationConfirm);
        return reservationConfirmMapper.toReservartionConfirm(reservaConfirmadaCrud.save(reservaConfirmada));
    }

    @Override
    public void delete(Integer id) {
      reservaConfirmadaCrud.deleteById(id);
    }
}
