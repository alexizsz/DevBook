package com.Alexis.dev.backend.repository;

import com.Alexis.dev.backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
