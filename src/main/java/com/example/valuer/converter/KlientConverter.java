package com.example.valuer.converter;

import com.example.valuer.model.Klient;
import com.example.valuer.repository.KlientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class KlientConverter implements Converter<String, Klient> {

    @Autowired
    private KlientRepository klientRepository;

    @Override
    public Klient convert(String source) {
        Long id = Long.parseLong(source);
        return klientRepository.findById(id).orElse(null);
    }
}
