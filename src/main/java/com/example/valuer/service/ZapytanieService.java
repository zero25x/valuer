package com.example.valuer.service;

import com.example.valuer.model.Zapytanie;
import com.example.valuer.repository.ZapytanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZapytanieService {

    private final ZapytanieRepository zapytanieRepository;

    @Autowired
    public ZapytanieService(ZapytanieRepository zapytanieRepository) {
        this.zapytanieRepository = zapytanieRepository;
    }

    public void saveZapytanie(Zapytanie zapytanie) {
        zapytanieRepository.save(zapytanie);
    }

    public List<Zapytanie> findAllZapytania() {
        return zapytanieRepository.findAll();
    }

    public void deleteZapytanie(Long id) {
        zapytanieRepository.deleteById(id);
    }
}
