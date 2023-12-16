package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Role;

import java.util.List;
import java.util.Optional;

public interface RoleServiceInter {

    List<Role> getAll();

    Role save(Role role);

    void delete(Integer roleId);

    Optional<Role> getById(Integer roleId);
}
