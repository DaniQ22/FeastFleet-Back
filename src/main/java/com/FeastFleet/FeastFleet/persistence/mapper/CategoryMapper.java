package com.FeastFleet.FeastFleet.persistence.mapper;

import com.FeastFleet.FeastFleet.domain.dto.Category;
import com.FeastFleet.FeastFleet.domain.dto.CategoryRestaurant;
import com.FeastFleet.FeastFleet.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "id", target = "idCategory"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategories (List<Categoria> categorias);


    @InheritInverseConfiguration
    Categoria toCategoria (Category category);

}
