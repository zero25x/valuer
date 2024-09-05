package com.example.valuer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.valuer.model.Klient;
import com.example.valuer.repository.KlientRepository;

@Service
public class KlientService {
    
    private final KlientRepository klientRepository;

    @Autowired
    public KlientService(KlientRepository klientRepository) {
        this.klientRepository = klientRepository;
    }

    public void saveKlient(Klient klient) {
        klientRepository.save(klient);
    }

    public List<Klient> findAllKlient() {
        return klientRepository.findAll();
    }

    public void deleteKlient(Long id) {
        klientRepository.deleteById(id);
    }

    public List<Klient> findAllKlient2(){
        return klientRepository.findAll();
    }

}

