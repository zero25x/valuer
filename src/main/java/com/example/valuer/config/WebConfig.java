package com.example.valuer.config;

import com.example.valuer.converter.KlientConverter;
import com.example.valuer.converter.KartaConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private KlientConverter klientConverter;

    @Autowired
    private KartaConverter kartaConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(klientConverter);
        registry.addConverter(kartaConverter);
    }
}
