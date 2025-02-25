package com.salonbooking.controllers;

import com.salonbooking.models.Salon;
import com.salonbooking.services.SalonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class SalonController {
    private final SalonService salonService;

    public SalonController(SalonService salonService) {
        this.salonService = salonService;
    }

    @GetMapping("/salon/{id}")
    public String salonProfile(@PathVariable Long id, Model model) {
        Optional<Salon> salon = salonService.getSalonById(id);
        if (salon.isPresent()) {
            model.addAttribute("salon", salon.get());
            return "salon-profile";  // Renders salon-profile.html
        }
        return "redirect:/"; // Redirects to Home Page if salon not found
    }
}
