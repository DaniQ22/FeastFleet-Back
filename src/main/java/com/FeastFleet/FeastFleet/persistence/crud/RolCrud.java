package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Rol;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.ListCrudRepository;

public interface RolCrud extends ListCrudRepository<Rol, Integer> {

}
