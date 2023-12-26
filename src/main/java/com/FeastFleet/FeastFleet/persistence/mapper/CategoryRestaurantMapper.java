package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.CategoryRestaurant;
import com.FeastFleet.FeastFleet.persistence.entity.RestauranteCategoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, RestaurantMapper.class})
public interface CategoryRestaurantMapper{

@Mappings({
        @Mapping(source = "categoria", target ="category" ),


})
CategoryRestaurant toCatRest (RestauranteCategoria restauranteCategoria);

List<CategoryRestaurant> toCategoryRestaurant(List<RestauranteCategoria> restauranteCategorias);

@InheritInverseConfiguration
@Mappings({
        @Mapping(target = "rest", ignore = true ),
        @Mapping(target = "id.idCategoria", ignore = true),

        @Mapping(target = "id.restaurante", ignore = true)
})
RestauranteCategoria toRestCat (CategoryRestaurant categoryRestaurant);


}
