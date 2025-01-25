package com.example.customerregwithjpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false, name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(unique = true,name = "password")
    private Integer password;
    @OneToMany
    List<Product> product;
    @OneToOne
    WarrantyModel warranty;
    @ManyToMany
    private List<CustomerPromotions> customerPromotions;
    @ManyToOne
    private PaymentModel payment;
}
