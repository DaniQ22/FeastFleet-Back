package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Role;

import java.util.List;

public interface RoleServiceInter {

    List<Role> getAll();

    Role save(Role role);
}
