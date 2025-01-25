package com.example.customerregwithjpa.service;


import com.example.customerregwithjpa.dao.CustomerDao;
import com.example.customerregwithjpa.dao.CustomerPromotionsRepo;
import com.example.customerregwithjpa.dao.ProductRepo;
import com.example.customerregwithjpa.dao.WarrantRepo;
import com.example.customerregwithjpa.model.CustomerModel;
import com.example.customerregwithjpa.model.CustomerPromotions;
import com.example.customerregwithjpa.model.Product;
import com.example.customerregwithjpa.model.WarrantyModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerDao customerDao;
    private final ProductRepo productRepo;
    private final WarrantRepo warrantRepo;
    private final CustomerPromotionsRepo customerPromotionsRepo;

    public CustomerModel createCustomer(CustomerModel customerModel){
        List<Product> products = customerModel.getProduct();
        WarrantyModel warrantyModel =  customerModel.getWarranty();
        List<CustomerPromotions> customerPromotions = customerModel.getCustomerPromotions();
        customerPromotionsRepo.saveAll(customerPromotions);
        warrantRepo.save(warrantyModel);
        productRepo.saveAll(products);
        return customerDao.save(customerModel);
    }

    public Iterable<CustomerModel> getAllCustomers() {
        return customerDao.findAll();
    }

    public CustomerModel getCustomerById(Integer id){
        return customerDao.findById(id).orElse( new CustomerModel());
    }

    public CustomerModel updateCustomerDetails(Integer id, String email){
        CustomerModel customerModel = getCustomerById(id);
        customerModel.setEmail(email);
        return customerDao.save(customerModel);
    }


    public boolean deleteCustomerId(Integer id){
        customerDao.deleteById(id);
        return true;
    }

    public List<CustomerModel> getCustomerByName(String name){
        return customerDao.findAllByName(name);
    }

    public List<CustomerModel> getCustomerByEmail(String email){
        return customerDao.findAllByName(email);
    }
}
