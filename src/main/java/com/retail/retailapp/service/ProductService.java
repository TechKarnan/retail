package com.retail.retailapp.service;

import com.retail.retailapp.model.Product;
import com.retail.retailapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public List<Product> findAll() {
        return repo.findAll();
    }
}
