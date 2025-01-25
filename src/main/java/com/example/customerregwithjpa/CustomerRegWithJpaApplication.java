package com.example.customerregwithjpa;

import com.example.customerregwithjpa.model.CustomerModel;
import com.example.customerregwithjpa.model.Product;
import com.example.customerregwithjpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CustomerRegWithJpaApplication implements CommandLineRunner {
    private final CustomerService customerService;
    public CustomerRegWithJpaApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerRegWithJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        CustomerModel customerModel = new CustomerModel();
//        Product product = new Product();
//
//        customerModel.setName("Elmar");
//        customerModel.setEmail("elmar@gmail.com");
//        customerModel.setLastName("Jafarli");
//        customerModel.setPassword(12345);
//        customerModel.setProduct(List.of(
//                Product.class.newInstance()));
//        customerService.createCustomer(customerModel);
    }
}
