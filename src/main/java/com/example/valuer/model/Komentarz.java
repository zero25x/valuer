package com.example.valuer.model;

import java.time.LocalDateTime;

import javax.persistence.*;



@Entity
public class Komentarz {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String employeeAdded;
    private LocalDateTime dateAdded;
    @ManyToOne
    private Wycena wycena;


    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
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
    public Wycena getWycena() {
        return wycena;
    }
    public void setWycena(Wycena wycena) {
        this.wycena = wycena;
    }



}
