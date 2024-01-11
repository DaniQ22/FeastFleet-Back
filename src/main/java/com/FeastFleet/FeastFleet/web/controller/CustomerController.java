package com.FeastFleet.FeastFleet.web.controller;

import com.FeastFleet.FeastFleet.domain.dto.Customer;
import com.FeastFleet.FeastFleet.domain.service.CustomerServiceInter;
import com.FeastFleet.FeastFleet.web.message.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerServiceInter serviceInter;


    @Autowired
    public CustomerController(CustomerServiceInter serviceInter) {
        this.serviceInter = serviceInter;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try {
            List<Customer> customerList = serviceInter.getAll();
            return ResponseEntity.status(HttpStatus.OK).body(customerList);
        }catch (MessageException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe clientes");
        }
    }

    @GetMapping("/getById/{customerId}")
    public  ResponseEntity<?> grtById(@PathVariable String customerId) {
        return ResponseEntity.status(HttpStatus.OK).body(serviceInter.getById(customerId));
    }
}
