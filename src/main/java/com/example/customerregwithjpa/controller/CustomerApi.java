package com.example.customerregwithjpa.controller;


import com.example.customerregwithjpa.model.CustomerModel;
import com.example.customerregwithjpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerApi {

    private final CustomerService customerService;



    @GetMapping("/byName/{name}")
    public List<CustomerModel> findByName(@PathVariable String name) {
       return  customerService.getCustomerByName(name);
    }

    @PostMapping("/createCustomer")
    public ResponseEntity<CustomerModel> createCustomer(@RequestBody CustomerModel customerModel) {
        customerService.createCustomer(customerModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerModel);
    }


    @GetMapping("/getAllCustomers")
    public Iterable<CustomerModel> getAllCustomers() {
        return  customerService.getAllCustomers();
    }


    @GetMapping("/getSingleCustomer/{id}")
    public ResponseEntity<CustomerModel> getSingleCustomer(@PathVariable Integer id) {
        customerService.getCustomerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(id));
    }

    @PutMapping("/updateCustomer/{id}/{email}")
    public ResponseEntity<CustomerModel> updateCustomer(@PathVariable("id") Integer id, @PathVariable("email") String email) {
        customerService.updateCustomerDetails(id, email);
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(id));
    }

    @DeleteMapping("/{id}")
    public String getAllCustomers(@PathVariable Integer id) {

        if(customerService.deleteCustomerId(id)){
            return "Custmomer id: " + id + " is deleted succesfully";
        } else {
            return "Customer id " + id + " is not deleted";
        }
    }

    @GetMapping("getByEmail/{email}")
    public List<CustomerModel> getCustomerByEmail(@PathVariable("email") String email) {
        return  customerService.getCustomerByEmail(email);
    }

}
