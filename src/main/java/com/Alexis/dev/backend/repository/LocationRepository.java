package com.Alexis.dev.backend.repository;

import com.Alexis.dev.backend.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
