package com.example.pharmacie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id
    private long id;
    private String name;

    private int quantity;

    private double price;

    private String description;

}
