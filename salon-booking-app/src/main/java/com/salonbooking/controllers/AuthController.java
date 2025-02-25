package com.salonbooking.controllers;

import com.salonbooking.models.User;
import com.salonbooking.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Renders login.html
    }

    @GetMapping("/signup")
    public String signupPage(Model model) {
        model.addAttribute("user", new User()); // Add empty user object for form binding
        return "signup"; // Renders signup.html
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.saveUser(user); // Save user in DB
        return "redirect:/login"; // Redirect to login page after successful signup
    }
}
