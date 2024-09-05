package com.example.valuer.controller;

import com.example.valuer.model.Klient;
import com.example.valuer.model.Karta;
import com.example.valuer.model.KlientKarta;
import com.example.valuer.repository.KlientKartaRepository;
import com.example.valuer.repository.KlientRepository;
import com.example.valuer.repository.KartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class KlientKartaController {

    @Autowired
    private KlientRepository klientRepository;

    @Autowired
    private KartaRepository kartaRepository;

    @Autowired
    private KlientKartaRepository klientKartaRepository;

    @GetMapping("/klientKarta")
    public String showForm(Model model) {
        List<Klient> klienci = klientRepository.findAll();
        List<Karta> karty = kartaRepository.findAll();

        model.addAttribute("klienci", klienci);
        model.addAttribute("karty", karty);
        model.addAttribute("klientKarta", new KlientKarta());

        return "klientKartaForm";
    }

    @PostMapping("/klientKarta")
    public String submitForm(@ModelAttribute KlientKarta klientKarta) {
        klientKartaRepository.save(klientKarta);
        return "redirect:/klientKarta";
    }
}
