package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.domain.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserServiceInter userServiceInter;

    @Autowired
    public UserController(UserServiceInter userServiceInter) {
        this.userServiceInter = userServiceInter;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userServiceInter.getAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userServiceInter.save(user);
    }

}
