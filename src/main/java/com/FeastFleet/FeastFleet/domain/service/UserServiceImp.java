package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.User;
import com.FeastFleet.FeastFleet.domain.repository.UserRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }
}
