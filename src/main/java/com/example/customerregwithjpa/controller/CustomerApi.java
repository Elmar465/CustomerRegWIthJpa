package com.example.customerregwithjpa.controller;


import com.example.customerregwithjpa.model.CustomerModel;
import com.example.customerregwithjpa.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerApi {

    private final CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }



    @PostMapping("/createCustomer")
    public ResponseEntity<CustomerModel> createCustomer(@RequestBody CustomerModel customerModel) {
        customerService.createCustomer(customerModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerModel);
    }


    @GetMapping("/getAllCustomers")
    public ResponseEntity<List<CustomerModel>> getAllCustomers() {
        customerService.getAllCustomers();
        return ResponseEntity.status(HttpStatus.OK).body((List<CustomerModel>) customerService);
    }

    @GetMapping("/getSingleCustomer/{id}")
    public ResponseEntity<CustomerModel> getSingleCustomer(@PathVariable Integer id) {
        customerService.getCustomerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(id));
    }

    @PutMapping("/updateCustomer/{id}/{email}")
    public ResponseEntity<CustomerModel> updateCustomer(@PathVariable Integer id, @PathVariable String email) {
        customerService.updateCustomerDetails(id, email);
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerModel> deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomerId(id);
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(id));
    }

}
