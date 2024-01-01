package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.persistence.entity.Restaurante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ImageRestaurantMapper.class, CategoryRestaurantMapper.class})
public interface RestaurantMapper {

    @Mappings({
            @Mapping(source = "idRestaurante", target = "restaurantId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "tipoCocina", target = "cookType"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "imagenes", target = "image"),
            @Mapping(source = "categorias", target = "categories"
            )
    })
    Restaurant toRestaurant(Restaurante restaurante);

    @InheritInverseConfiguration
    @Mapping(target = "calificacion", ignore = true)
    Restaurante toRestaurante(Restaurant restaurant);


    List<Restaurant> toRestaurants(List<Restaurante> restaurantes);
}
