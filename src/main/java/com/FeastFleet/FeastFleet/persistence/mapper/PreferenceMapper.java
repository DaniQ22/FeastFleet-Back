package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.persistence.entity.Preferencia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PreferenceMapper {

    @Mappings({
            @Mapping(source = "idPreferencia", target = "preferenceId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "preferencia", target = "preference")
    })
    Preference toPreference(Preferencia preferencias);
    List<Preference> toPreference (List<Preferencia> preferencias);

    @InheritInverseConfiguration
    Preferencia toPreferencia (Preference preference);
}
