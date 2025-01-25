package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
