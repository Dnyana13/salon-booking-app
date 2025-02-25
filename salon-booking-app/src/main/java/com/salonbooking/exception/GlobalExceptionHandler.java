package com.salonbooking.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex, Model model) {
        ModelAndView modelAndView = new ModelAndView("error-500");
        model.addAttribute("errorMessage", ex.getMessage());
        return modelAndView;
    }

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleRuntimeException(RuntimeException ex, Model model) {
        ModelAndView modelAndView = new ModelAndView("error-500");
        model.addAttribute("errorMessage", ex.getMessage());
        return modelAndView;
    }
}
