package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.persistence.entity.Reserva;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    @Mappings({
            @Mapping(source = "id.idRestaurante", target = "idRestaurant"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "numeroComensales", target = "comensNumber"),

    })
    Reservation toReservation(Reserva reserva);

    @InheritInverseConfiguration
    Reserva toReserva(Reservation reservation);

    List<Reservation> toReservations(List<Reserva> reserva);

}
