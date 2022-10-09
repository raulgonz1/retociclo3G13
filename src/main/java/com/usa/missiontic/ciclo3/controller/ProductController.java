package com.usa.missiontic.ciclo3.controller;


import com.usa.missiontic.ciclo3.entities.Product;
import com.usa.missiontic.ciclo3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping ("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Product save(@RequestBody Product p) {
        return productService.save(p);
    }

    }

