package com.FeastFleet.FeastFleet.domain.repository;

import com.FeastFleet.FeastFleet.domain.dto.Role;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RoleRepositoryInter {

    List<Role> getAll();

    Role save(Role role);
}
