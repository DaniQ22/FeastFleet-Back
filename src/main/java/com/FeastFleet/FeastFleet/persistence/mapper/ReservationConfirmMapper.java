package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.persistence.entity.ReservaConfirmada;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationConfirmMapper {

    @Mappings({
            @Mapping(source = "reservaConfirmadaId", target = "confirmedReservationId"),
            @Mapping(source = "idUsuario", target = "usuarioId"),
            @Mapping(source = "idRestaurante", target = "restaurantId"),
            @Mapping(source = "codigoConfirmacion", target = "confirmatedCode"),
            @Mapping(source = "fechaConfirmacion", target = "confirmatedDate"),
    })
    ReservationConfirm toReservartionConfirm(ReservaConfirmada reservaConfirmada);

    @InheritInverseConfiguration
    ReservaConfirmada toReservaConfirmada(ReservationConfirm reservarionConfirm);

    List<ReservationConfirm> toReservartionsConfirms(List<ReservaConfirmada> reservaConfirmada);

}
