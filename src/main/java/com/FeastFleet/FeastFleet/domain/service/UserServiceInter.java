package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.User;

import java.util.List;

public interface UserServiceInter {

    List<User> getAll();

    User save(User user);

}
