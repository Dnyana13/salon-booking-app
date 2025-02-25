package com.salonbooking.repositories;

import com.salonbooking.models.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<Salon, Long> {
}
