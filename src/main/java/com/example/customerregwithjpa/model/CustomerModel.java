package com.example.customerregwithjpa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
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



    //Get ID
    public Integer getId() {
        return id;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Getter
    public String getLastName(){
        return lastName;
    }


    //Setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    //Getter
    public String getEmail() {
        return email;
    }


    //Setter
    public void setEmail(String email) {
        this.email = email;
    }

    //Getter
    public Integer getPassword() {
        return password;
    }

    //Setter
    public void setPassword(Integer password) {
        this.password = password;
    }


}
