package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.domain.repository.UserRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserServiceInter{

    private final UserRepositoryInter userRepositoryInter;

    @Autowired
    public UserServiceImp(UserRepositoryInter userRepositoryInter) {
        this.userRepositoryInter = userRepositoryInter;
    }


    @Override
    public List<User> getAll() {
        return userRepositoryInter.getAll();
    }

    @Override
    public User save(User user) {

        return userRepositoryInter.save(user);
    }

    @Override
    public Optional<User> getByID(String id) {
        return userRepositoryInter.getByID(id);
    }

    @Override
    public void delete(String id) {
        userRepositoryInter.delete(id);
    }


}
