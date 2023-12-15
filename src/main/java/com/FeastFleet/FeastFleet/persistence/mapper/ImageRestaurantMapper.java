package com.FeastFleet.FeastFleet.persistence.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {RestaurantMapper.class})
public interface ImageRestaurantMapper {

    
}
