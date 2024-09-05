package com.example.valuer.controller;

import com.example.valuer.model.Zapytanie;
import com.example.valuer.service.ZapytanieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/zapytanie")
public class ZapytanieController {

    private final ZapytanieService zapytanieService;

    @Autowired
    public ZapytanieController(ZapytanieService zapytanieService) {
        this.zapytanieService = zapytanieService;
    }

    // Wyświetlanie formularza do dodawania nowego zapytania
    @GetMapping("/form")
    public String showZapytanieForm(Model model) {
        model.addAttribute("zapytanie", new Zapytanie());
        return "zapytanie-form"; // Widok z formularzem
    }

    // Obsługa formularza i zapisywanie zapytania
    @PostMapping("/save")
    public String saveZapytanie(@ModelAttribute Zapytanie zapytanie, Model model) {
        model.addAttribute("zapytanie", zapytanie);
        System.out.println(zapytanie.getKlient().getId());
        zapytanieService.saveZapytanie(zapytanie);

        return "redirect:/zapytanie/form"; // Po zapisaniu przekierowanie z powrotem do formularza
    }

    // Wyświetlanie listy zapytań
    @GetMapping("/zapytania")
    public String getAllZapytania(Model model) {
        List<Zapytanie> zapytania = zapytanieService.findAllZapytania();
        model.addAttribute("zapytania", zapytania);
        return "zapytania-list"; // Widok z listą zapytań
    }

    // Usuwanie zapytania po ID
    @GetMapping("/delete/{id}")
    public String deleteZapytanie(@PathVariable Long id) {
        zapytanieService.deleteZapytanie(id);
        return "redirect:/zapytanie/zapytania"; // Po usunięciu przekierowanie do listy zapytań
    }
}
