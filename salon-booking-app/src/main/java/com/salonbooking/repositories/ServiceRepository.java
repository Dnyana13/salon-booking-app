package com.salonbooking.repositories;

import com.salonbooking.models.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
