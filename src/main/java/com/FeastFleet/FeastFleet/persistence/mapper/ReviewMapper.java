package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.persistence.entity.Resena;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    @Mappings({
            @Mapping(source = "idResena.idUsuario", target ="userId" ),
            @Mapping(source = "idResena.idRestaurante", target ="restaurantId" ),
            @Mapping(source = "comentario", target ="comment" ),
            @Mapping(source = "calificacion", target ="qualification" ),

    })
    Review toReviwe (Resena resena);
    List<Review> toReview(List<Resena> resenas);


    @InheritInverseConfiguration
    Resena toResena (Review review);
}
