package com.Alexis.dev.backend.repository;

import com.Alexis.dev.backend.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
