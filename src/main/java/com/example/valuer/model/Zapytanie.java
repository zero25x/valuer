package com.example.valuer.model;

import java.time.LocalDateTime;

import javax.persistence.*;



@Entity
public class Zapytanie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeAdded;
    private LocalDateTime dateAdded;
    private String isPotential;
    private String text;
    @ManyToOne
    private Klient klient;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmployeeAdded() {
        return employeeAdded;
    }
    public void setEmployeeAdded(String employeeAdded) {
        this.employeeAdded = employeeAdded;
    }
    public LocalDateTime getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
    public String getIsPotential() {
        return isPotential;
    }
    public void setIsPotential(String isPotential) {
        this.isPotential = isPotential;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Klient getKlient() {
        return klient;
    }
    public void setKlient(Klient klient) {
        this.klient = klient;
    }




}
