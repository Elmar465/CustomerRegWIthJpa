package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.WarrantyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantRepo extends JpaRepository<WarrantyModel, Integer> {
}
