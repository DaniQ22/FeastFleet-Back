package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.ReservationConfirm;
import com.FeastFleet.FeastFleet.domain.service.ReservationConfirmService;
import com.FeastFleet.FeastFleet.domain.service.ReservationConfirmServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservationconfirmed")
public class ReservationConfirmedController {

    private final ReservationConfirmService reservationConfirmService;

    public ReservationConfirmedController(ReservationConfirmService reservationConfirmService) {
        this.reservationConfirmService = reservationConfirmService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReservationConfirm>> getAll(){
        return ResponseEntity.ok( reservationConfirmService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ReservationConfirm>> getAll(@PathVariable Integer id){
        return ResponseEntity.ok(reservationConfirmService.getById(id));
    }
    @PostMapping("/save")
    public ResponseEntity<ReservationConfirm> save(@RequestBody ReservationConfirm reservationConfirm){
        return ResponseEntity.ok(reservationConfirmService.save(reservationConfirm));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        reservationConfirmService.delete(id);
        return ResponseEntity.ok().build();
    }
}
