package com.salonbooking.controllers;

import com.salonbooking.models.Salon;
import com.salonbooking.services.SalonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final SalonService salonService;

    public HomeController(SalonService salonService) {
        this.salonService = salonService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<Salon> salons = salonService.getAllSalons();
        model.addAttribute("salons", salons);
        return "home";  // Renders home.html in templates folder
    }
}
