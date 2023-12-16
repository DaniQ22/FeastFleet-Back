package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.repository.RestaurantRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImp implements RestaurantServiceInter{

    private final RestaurantRepositoryInter restaurantRepositoryInter;

    @Autowired
    public RestaurantServiceImp(RestaurantRepositoryInter restaurantRepositoryInter) {
        this.restaurantRepositoryInter = restaurantRepositoryInter;
    }

    public List<Restaurant> getAll() {
    return restaurantRepositoryInter.getAll();
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepositoryInter.save(restaurant);
    }

    @Override
    public Optional<Restaurant> getById(String id) {
        return restaurantRepositoryInter.getById(id);
    }

    @Override
    public void delete(String id) {
        restaurantRepositoryInter.detele(id);
    }
}
