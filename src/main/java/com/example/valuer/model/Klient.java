package com.example.valuer.model;

import javax.persistence.*;

@Entity
public class Klient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String vatNumber;
    private String employeeCalls;





    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getVatNumber() {
        return vatNumber;
    }
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
    public String getEmployeeCalls() {
        return employeeCalls;
    }
    public void setEmployeeCalls(String employeeCalls) {
        this.employeeCalls = employeeCalls;
    }

    


}
