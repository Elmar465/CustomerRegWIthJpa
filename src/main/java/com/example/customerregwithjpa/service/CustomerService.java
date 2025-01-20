package com.example.customerregwithjpa.service;


import com.example.customerregwithjpa.dao.CustomerDao;
import com.example.customerregwithjpa.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerDao customerDao;
    public CustomerService(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public CustomerModel createCustomer(CustomerModel customerModel){
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


    public void deleteCustomerId(Integer id){
        customerDao.deleteById(id);
    }
}
