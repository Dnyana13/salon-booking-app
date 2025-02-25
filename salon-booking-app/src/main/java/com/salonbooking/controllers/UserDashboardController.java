package com.salonbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDashboardController {

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "user-dashboard"; // Renders user-dashboard.html
    }
}
