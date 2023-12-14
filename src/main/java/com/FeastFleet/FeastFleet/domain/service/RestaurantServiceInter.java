package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;

import java.util.List;

public interface RestaurantServiceInter {

    List<Restaurant> getAll();

    Restaurant save(Restaurant restaurant);

}
