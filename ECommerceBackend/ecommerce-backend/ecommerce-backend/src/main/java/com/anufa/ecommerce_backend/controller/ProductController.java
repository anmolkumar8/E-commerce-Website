package com.anufa.ecommerce_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.anufa.ecommerce_backend.model.Product;
import com.anufa.ecommerce_backend.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> all() {
        return repo.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repo.save(product);
    }
}