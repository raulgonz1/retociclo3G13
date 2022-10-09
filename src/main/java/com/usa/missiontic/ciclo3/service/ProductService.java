package com.usa.missiontic.ciclo3.service;

import com.usa.missiontic.ciclo3.entities.Product;
import com.usa.missiontic.ciclo3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int id) {
        return productRepository.getProduct(id);
    }

    public Product save(Product p) {
        if (p.getId() == null) {
            return productRepository.save(p);
        } else {
            Optional<Product> e = productRepository.getProduct(p.getId());
            if (e.isPresent()) {
                return p;
            }
        }
        return p;
    }
}
