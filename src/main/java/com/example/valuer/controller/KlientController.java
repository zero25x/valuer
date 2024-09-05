package com.example.valuer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.valuer.model.Karta;
import com.example.valuer.model.Klient;
import com.example.valuer.model.KlientKarta;
import com.example.valuer.repository.KartaRepository;
import com.example.valuer.repository.KlientKartaRepository;
import com.example.valuer.repository.KlientRepository;
import com.example.valuer.service.KlientService;


@Controller
@RequestMapping("/client")
public class KlientController {
    


    private final KlientService klientService;
    private final KlientKartaRepository klientKartaRepository;
    private final KlientRepository klientRepository;


    @Autowired
    public KlientController(KlientService klientService, KlientKartaRepository klientKartaRepository, KlientRepository klientRepository) {
        this.klientService = klientService;
        this.klientKartaRepository = klientKartaRepository;
        this.klientRepository = klientRepository;
    }



    @GetMapping("/klienci")
    public String showAllKlienci(Model model) {
        List<Klient> klienci = klientService.findAllKlient2();
        model.addAttribute("klienci", klienci);
        return "klienci";
    }
    // Display form to input Klient data
    @GetMapping("/form")
    public String showKlientForm(Model model) {
        // Add a new, empty Klient object to the model
        model.addAttribute("klient1", new Klient());
        return "klient-form"; // Return the form view
    }

    // Handle form submission
    @PostMapping("/save")
    public String saveKlient(@ModelAttribute Klient klient, Model model) {
        // Add the saved Klient to the model to confirm the submission
        model.addAttribute("klient", klient);

        klientService.saveKlient(klient);
    
        // Redirect to a confirmation page or display saved data
        return "redirect:/client/form"; // View that confirms or shows saved Klient
    }

    // @GetMapping("/klienci")
    // public String getAllKlienci(Model model) {
    //     // Symulacja pobrania listy klientów z bazy danych
    //     List<Klient> klienci = klientService.findAllKlient();
    //     // Dodanie listy klientów do modelu
    //     model.addAttribute("klienci", klienci);

    //     return "klienci-list"; // Zwraca nazwę widoku Thymeleaf
    // }

    @GetMapping("/delete/{id}")
    public String deleteKlient(@PathVariable Long id) {
        System.out.println("abc");
        klientService.deleteKlient(id);
        return "redirect:/client/klienci";
    }

    @GetMapping("/details/{id}")
    public String showDetails(@PathVariable Long id, Model model) {
        // Pobierz klienta po ID
        Klient klient = klientRepository.findById(id).orElse(null);
        if (klient == null) {
            // Obsłuż przypadek, gdy klient nie istnieje
            return "error";
        }

        // Pobierz wszystkie powiązane karty przez KlientKarta
        List<KlientKarta> klientKarty = klientKartaRepository.findByKlient(klient);

        // Wyciągnij same obiekty Karta z listy KlientKarta
        List<Karta> karty = klientKarty.stream()
                .map(KlientKarta::getKarta)
                .collect(Collectors.toList());

        // Przekaż dane do widoku
        model.addAttribute("klient", klient);
        model.addAttribute("karty", karty);

        return "klient-details"; // Wyświetli widok 'klient-details.html'
    }



}
