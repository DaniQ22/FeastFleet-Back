package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.domain.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Review")
public class ReviewController {
    private final ReviewService service;


    @Autowired
    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @GetMapping("/getAll/{restaurantId}")
    public ResponseEntity<List<Review>> getAll(@PathVariable String restaurantId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll(restaurantId));
    }

    @PostMapping("/save")
    public ResponseEntity<?>  save(@RequestBody Review review){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(review));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{reviewId}")
    public ResponseEntity<?> delete(@PathVariable Integer reviewId){
        try{
            service.delete(reviewId);
            return ResponseEntity.status(HttpStatus.OK).body("Reseña eliminada");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }

    @GetMapping("/getById/{reviewId}")
    public ResponseEntity<Optional<Review>> getById(@PathVariable Integer reviewId){
        return new ResponseEntity<>(service.getById(reviewId), HttpStatus.OK);
    }

}
