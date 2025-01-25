package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<CustomerModel, Integer> {


    @Query("SELECT c FROM CustomerModel c WHERE c.name = ?1")
    List<CustomerModel> findAllByName(String firstName);


    @Query("SELECT c FROM CustomerModel  c WHERE c.email = :email")
    List<CustomerModel> findAllByEmail(String email);



}
