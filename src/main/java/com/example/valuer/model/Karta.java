package com.example.valuer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Karta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbolSubiekt;
    private String numerKarty;
    private String cenaZakupu;



    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSymbolSubiekt() {
        return symbolSubiekt;
    }
    public void setSymbolSubiekt(String symbolSubiekt) {
        this.symbolSubiekt = symbolSubiekt;
    }
    public String getNumerKarty() {
        return numerKarty;
    }
    public void setNumerKarty(String numerKarty) {
        this.numerKarty = numerKarty;
    }
    public String getCenaZakupu() {
        return cenaZakupu;
    }
    public void setCenaZakupu(String cenaZakupu) {
        this.cenaZakupu = cenaZakupu;
    }
    
}
