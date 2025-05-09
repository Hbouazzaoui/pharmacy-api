package com.example.pharmacie.repositories;

import com.example.pharmacie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}