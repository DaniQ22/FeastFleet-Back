package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.domain.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceInter userServiceInter;

    @Autowired
    public UserController(UserServiceInter userServiceInter) {
        this.userServiceInter = userServiceInter;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(userServiceInter.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        return  ResponseEntity.ok(userServiceInter.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getById(@PathVariable String id){
        return ResponseEntity.ok(userServiceInter.getByID(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        userServiceInter.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
       return ResponseEntity.ok(this.userServiceInter.save(user));

    }

}
