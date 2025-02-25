package com.salonbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String paymentPage() {
        return "payment"; // Renders payment.html
    }

    @GetMapping("/booking-confirmation")
    public String bookingConfirmation() {
        return "booking-confirmation"; // Renders booking-confirmation.html
    }
}
