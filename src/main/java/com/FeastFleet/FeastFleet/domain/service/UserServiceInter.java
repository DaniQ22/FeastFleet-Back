package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInter {

    List<User> getAll();

    User save(User user);

    Optional<User> getByID(String id);

    void delete(String id);
}
