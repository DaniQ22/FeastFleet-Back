package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInter {
    List<Customer> getAll();

    Optional<Customer> getById(String customerId);
}
