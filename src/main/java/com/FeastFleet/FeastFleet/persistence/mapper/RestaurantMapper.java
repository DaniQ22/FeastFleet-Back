package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.persistence.entity.Restaurante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    @Mappings({
            @Mapping(source = "idRestaurante", target = "restaurantId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "tipoCocina", target = "cookType"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "calificacion", target = "calification")
    })
    Restaurant toRestaurant(Restaurante restaurante);

    @InheritInverseConfiguration
    Restaurante toRestaurante(Restaurant restaurant);


    List<Restaurant> toRestaurants(List<Restaurante> restaurantes);
}
