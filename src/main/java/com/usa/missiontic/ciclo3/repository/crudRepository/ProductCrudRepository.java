package com.usa.missiontic.ciclo3.repository.crudRepository;

import com.usa.missiontic.ciclo3.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository <Product, Integer> {
    Object getAll();
}
