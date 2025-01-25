package com.example.customerregwithjpa.dao;

import com.example.customerregwithjpa.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepo extends JpaRepository<PaymentModel, Integer> {

}
