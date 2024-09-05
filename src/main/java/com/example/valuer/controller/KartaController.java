package com.example.valuer.controller;

import com.example.valuer.model.Karta;
import com.example.valuer.repository.KartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KartaController {

    @Autowired
    private KartaRepository kartaRepository;

    @GetMapping("/karty")
    public String showAllKarty(Model model) {
        List<Karta> karty = kartaRepository.findAll();
        model.addAttribute("karty", karty);
        return "karty";
    }
}
