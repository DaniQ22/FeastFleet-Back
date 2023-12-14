package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReservationMapper.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "contraseña", target = "password"),
            @Mapping(source = "idRol", target = "rolId"),
            @Mapping(source = "reservas", target = "reservations")
    })
    User toUser(Usuario usuario);
    @InheritInverseConfiguration
    Usuario toUsuario(User user);

    List<User> toUser(List<Usuario> usuario);
}
