package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Reservation;
import com.FeastFleet.FeastFleet.domain.service.ReservationServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    private final ReservationServiceInter reservationServiceInter;

    @Autowired
    public ReservationController(ReservationServiceInter reservationServiceInter) {
        this.reservationServiceInter = reservationServiceInter;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Reservation>> getAll(){
        return ResponseEntity.ok(reservationServiceInter.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Reservation>> getById(@PathVariable Integer id){
        return ResponseEntity.ok(reservationServiceInter.getById(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Reservation> save(@RequestBody Reservation reservation){
        return ResponseEntity.ok(reservationServiceInter.save(reservation));
    }
    @PutMapping("/update")
    public ResponseEntity<Reservation> update(@RequestBody Reservation reservation){
        return ResponseEntity.ok(reservationServiceInter.save(reservation));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        reservationServiceInter.delete(id);
        return ResponseEntity.ok().build();
    }

}
