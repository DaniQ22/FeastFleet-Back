package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.service.RestaurantServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Restaurant> getById(@PathVariable String id){
    return restaurantServiceInter.getById(id);
    }

    @PostMapping("save")
    public Restaurant save(@RequestBody Restaurant restaurant){

    return restaurantServiceInter.save(restaurant);
    }



}
