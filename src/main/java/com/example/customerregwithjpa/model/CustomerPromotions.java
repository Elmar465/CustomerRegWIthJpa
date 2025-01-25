package com.example.customerregwithjpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Promotions")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerPromotions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private Status status;
    @Column(name = "description")
    private String description;
}

enum Status {
    WON, PENDING,
}