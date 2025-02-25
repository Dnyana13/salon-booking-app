package com.salonbooking.services;

import com.salonbooking.models.Salon;
import com.salonbooking.repositories.SalonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalonService {
    private final SalonRepository salonRepository;

    public SalonService(SalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    public List<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    public Optional<Salon> getSalonById(Long id) {
        return salonRepository.findById(id);
    }

    public Salon saveSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    public void deleteSalon(Long id) {
        salonRepository.deleteById(id);
    }
}
