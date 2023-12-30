package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Restaurant;
import com.FeastFleet.FeastFleet.domain.service.RestaurantServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/restaurant")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {

  private final RestaurantServiceInter restaurantServiceInter;

  @Autowired
    public RestaurantController(RestaurantServiceInter restaurantServiceInter) {
        this.restaurantServiceInter = restaurantServiceInter;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Restaurant>> getAll() {
      return ResponseEntity.ok(restaurantServiceInter.getAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Restaurant>> getById(@PathVariable String id){
    return ResponseEntity.ok(restaurantServiceInter.getById(id));
    }

    @PostMapping("save")
    public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant){
    return ResponseEntity.ok(restaurantServiceInter.save(restaurant));

    }
    @DeleteMapping("/delete")
    public  ResponseEntity<Void> delete(@PathVariable String id){
      restaurantServiceInter.delete(id);
      return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant){
    return ResponseEntity.ok(restaurantServiceInter.save(restaurant));
    }
}
