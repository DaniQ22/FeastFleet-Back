package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Preference;
import com.FeastFleet.FeastFleet.domain.service.PreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.reactive.TransactionalEventPublisher;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.awt.geom.RectangularShape;
import java.util.List;

@Controller
@RequestMapping("Preference")
public class PreferenceContoller {

    private final PreferenceService service;


    @Autowired
    public PreferenceContoller(PreferenceService service) {
        this.service = service;
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<Preference>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    @DeleteMapping("/delete/{preferenceId}")
    public ResponseEntity<String> delete(@PathVariable Integer preferenceId){
        try {
            service.delete(preferenceId);
            return  ResponseEntity.status(HttpStatus.OK).body("Preferencia eliminada con exito");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> save (@RequestBody Preference preference){
        try {
           return new ResponseEntity<>(service.save(preference), HttpStatus.CREATED);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.OK).body("Error al guardar la preferencia");
        }
    }
}
