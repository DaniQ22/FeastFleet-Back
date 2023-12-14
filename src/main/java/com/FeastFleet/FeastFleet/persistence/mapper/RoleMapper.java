package com.FeastFleet.FeastFleet.persistence.mapper;
import com.FeastFleet.FeastFleet.domain.dto.Role;
import com.FeastFleet.FeastFleet.persistence.entity.Rol;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
            @Mapping(source = "idRol", target = "roleId"),
            @Mapping(source = "nombreRol", target = "roleName")
    })
    Role toRole (Rol rol);
    List<Role> toRoles (List<Rol> rols);

    @InheritInverseConfiguration
    Rol toRol (Role role);
}
