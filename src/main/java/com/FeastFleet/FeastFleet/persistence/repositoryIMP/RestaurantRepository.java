package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.repository.RestaurantRepositoryInter;
import com.FeastFleet.FeastFleet.persistence.crud.RestauranteCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Restaurante;
import com.FeastFleet.FeastFleet.persistence.mapper.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RestaurantRepository implements RestaurantRepositoryInter {

    private final RestaurantMapper restaurantMapper;
    private final RestauranteCrud restauranteCrud;

    @Autowired
    public RestaurantRepository(RestaurantMapper restaurantMapper, RestauranteCrud restauranteCrud) {
        this.restaurantMapper = restaurantMapper;
        this.restauranteCrud = restauranteCrud;
    }

    @Override
    public List<Restaurant> getAll() {
        List<Restaurante> restaurantes = restauranteCrud.findAll();
        return restaurantMapper.toRestaurants(restaurantes);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        Restaurante restaurante = restaurantMapper.toRestaurante(restaurant);
        return restaurantMapper.toRestaurant(restauranteCrud.save(restaurante));
    }

    @Override
    public Optional<Restaurant> getById(String id) {
        return restauranteCrud.findById(id).map(restaurantMapper::toRestaurant);
    }


}
