package com.FeastFleet.FeastFleet.domain.service;

import com.FeastFleet.FeastFleet.domain.dto.Customer;
import com.FeastFleet.FeastFleet.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceInter{

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Customer> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<Customer> getById(String customerId) {
        return repository.getById(customerId);
    }
}
