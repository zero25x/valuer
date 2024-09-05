package com.example.valuer.converter;

import com.example.valuer.model.Karta;
import com.example.valuer.repository.KartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class KartaConverter implements Converter<String, Karta> {

    @Autowired
    private KartaRepository kartaRepository;

    @Override
    public Karta convert(String source) {
        Long id = Long.parseLong(source);
        return kartaRepository.findById(id).orElse(null);
    }
}
