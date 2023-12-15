package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryInter {

 List<User> getAll();

 User save(User user);

 Optional<User> getByID(String id);

 void delete(String id);


}
