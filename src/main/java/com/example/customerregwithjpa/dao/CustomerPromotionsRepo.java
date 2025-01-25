package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.CustomerPromotions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPromotionsRepo extends JpaRepository<CustomerPromotions, Integer> {

}
