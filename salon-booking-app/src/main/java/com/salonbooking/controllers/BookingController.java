package com.salonbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

    @GetMapping("/book-appointment")
    public String bookAppointment() {
        return "appointment-booking"; // Renders appointment-booking.html
    }
}
