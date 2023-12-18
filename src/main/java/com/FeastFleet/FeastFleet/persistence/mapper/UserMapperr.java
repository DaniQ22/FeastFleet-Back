package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { RoleMapper.class })
public interface UserMapperr {

    @Mappings({
            @Mapping(source = "nombreUsuario", target = "userName"),
            @Mapping(source = "contraseña", target = "password"),
        //    @Mapping(source = "idCliente", target = "idCustomer"),
            @Mapping(source = "roless", target = "roles")
    })
    User toUser(Usuario usuario);
    @InheritInverseConfiguration
        //  @Mapping(target = "reservas", ignore = true)
    Usuario toUsuario(User user);

    List<User> toUser(List<Usuario> usuario);
}

