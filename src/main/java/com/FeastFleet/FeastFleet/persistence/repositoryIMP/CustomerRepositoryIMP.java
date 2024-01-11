package com.FeastFleet.FeastFleet.persistence.repositoryIMP;

import com.FeastFleet.FeastFleet.domain.dto.Customer;
import com.FeastFleet.FeastFleet.domain.repository.CustomerRepository;
import com.FeastFleet.FeastFleet.persistence.crud.CustomerCrud;
import com.FeastFleet.FeastFleet.persistence.entity.Cliente;
import com.FeastFleet.FeastFleet.persistence.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryIMP implements CustomerRepository {

    private final CustomerMapper mapper;

    private final CustomerCrud crud;

    @Autowired
    public CustomerRepositoryIMP(CustomerMapper mapper, CustomerCrud crud) {
        this.mapper = mapper;
        this.crud = crud;
    }


    @Override
    public List<Customer> getAll() {
        List<Cliente> clienteList = crud.findAll();
        return mapper.toCustomer(clienteList);
    }

    @Override
    public Optional<Customer> getById(String customerId) {
        Optional<Cliente> customer = crud.findById(customerId);
        return customer.map(cus -> mapper.toCustomer(cus));
    }
}
