package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<CustomerModel, Integer> {

}
