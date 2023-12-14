package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Restaurante;
import org.springframework.data.repository.ListCrudRepository;

public interface RestauranteCrud extends ListCrudRepository<Restaurante, String> {
}
