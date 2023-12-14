package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.service.RestaurantServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

  private final RestaurantServiceInter restaurantServiceInter;

  @Autowired
    public RestaurantController(RestaurantServiceInter restaurantServiceInter) {
        this.restaurantServiceInter = restaurantServiceInter;
    }

@GetMapping("/all")
    public List<Restaurant> getAll() {
      return restaurantServiceInter.getAll();

    }

}
