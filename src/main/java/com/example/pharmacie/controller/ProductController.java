package com.example.pharmacie.controller;

import com.example.pharmacie.entity.Product;
import com.example.pharmacie.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public Product saveProduct( @RequestBody Product product){
        return productRepository.save(product);
    }
    @GetMapping("/products")
    public List<Product> getProduct(){
        return productRepository.findAll();
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable long id){
        productRepository.deleteById(id);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productRepository.save(product);

    }
}