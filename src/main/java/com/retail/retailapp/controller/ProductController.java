package com.retail.retailapp.controller;

import com.retail.retailapp.service.ProductService;
import org.springframework.web.bind.annotation.*;
import com.retail.retailapp.model.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.findAll();
    }
}
