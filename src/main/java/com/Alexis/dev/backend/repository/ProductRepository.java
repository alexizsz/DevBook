package com.Alexis.dev.backend.repository;

import com.Alexis.dev.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
