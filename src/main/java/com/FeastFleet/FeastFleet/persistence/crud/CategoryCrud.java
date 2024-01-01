package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Categoria;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryCrud extends ListCrudRepository<Categoria, Integer> {

}
