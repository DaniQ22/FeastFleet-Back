package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.ImgRestaurant;
import com.FeastFleet.FeastFleet.persistence.entity.ImagenRestaurante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageRestaurantMapper {


    @Mappings({
            @Mapping(source = "urlImagenes", target = "imageUrl"),
            @Mapping(source = "idRestaurante", target = "restaurantId")

    })
    ImgRestaurant toImgRestaurant (ImagenRestaurante imagenRestaurante);

    List<ImgRestaurant> toImgRestaurabts(List<ImagenRestaurante> imagenRestaurantes);


    @InheritInverseConfiguration
    @Mappings( {
        @Mapping(target = "restaurante", ignore = true)
    })

    ImagenRestaurante toImgRestaunrante(ImgRestaurant imgRestaurant);

    
}
