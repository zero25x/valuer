package com.example.valuer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class KlientKarta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Klient klient;

    @ManyToOne
    private Karta karta;

    private String cenaSprzedazy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Karta getKarta() {
        return karta;
    }

    public void setKarta(Karta karta) {
        this.karta = karta;
    }

    public String getCenaSprzedazy() {
        return cenaSprzedazy;
    }

    public void setCenaSprzedazy(String cenaSprzedazy) {
        this.cenaSprzedazy = cenaSprzedazy;
    }
}
