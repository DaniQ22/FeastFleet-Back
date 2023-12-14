package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Review;
import com.FeastFleet.FeastFleet.domain.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Review")
public class ReviewController {
    private final ReviewService service;


    @Autowired
    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @GetMapping("/geAll")
    public ResponseEntity<List<Review>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
}
