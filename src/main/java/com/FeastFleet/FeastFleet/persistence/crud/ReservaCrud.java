package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Reserva;
import com.FeastFleet.FeastFleet.persistence.entity.ReservaPK;
import org.springframework.data.repository.ListCrudRepository;

public interface ReservaCrud extends ListCrudRepository<Reserva, ReservaPK> {
}
