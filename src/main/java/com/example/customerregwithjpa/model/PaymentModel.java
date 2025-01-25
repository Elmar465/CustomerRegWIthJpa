package com.example.customerregwithjpa.model;


import jakarta.annotation.security.DenyAll;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "carNumber")
    private Integer cardNumber;
    @Column(name = "CarHolderName")
    private String carHolderName;
    @Enumerated(EnumType.STRING)
    @Column(name = "BankName")
    private BankType bankType;

}

enum BankType {
    TD
}