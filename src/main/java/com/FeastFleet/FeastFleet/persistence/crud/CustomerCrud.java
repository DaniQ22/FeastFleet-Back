package com.FeastFleet.FeastFleet.persistence.crud;

import com.FeastFleet.FeastFleet.persistence.entity.Cliente;
import org.springframework.data.repository.ListCrudRepository;

public interface CustomerCrud extends ListCrudRepository<Cliente, String> {

}
