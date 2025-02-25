package com.salonbooking.services;

import com.salonbooking.models.ServiceEntity;
import com.salonbooking.repositories.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }
}
