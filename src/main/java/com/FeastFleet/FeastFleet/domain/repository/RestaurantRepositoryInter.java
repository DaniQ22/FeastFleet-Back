package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface RestaurantRepositoryInter {

    List<Restaurant> getAll();

    Restaurant save(Restaurant restaurant);

    Optional<Restaurant> getById(String id);

    void detele(String id);

}
