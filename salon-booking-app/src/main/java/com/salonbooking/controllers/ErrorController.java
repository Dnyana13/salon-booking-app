package com.salonbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error-404")
    public String error404() {
        return "error-404"; // Renders error-404.html
    }

    @GetMapping("/error-500")
    public String error500() {
        return "error-500"; // Renders error-500.html
    }
}
