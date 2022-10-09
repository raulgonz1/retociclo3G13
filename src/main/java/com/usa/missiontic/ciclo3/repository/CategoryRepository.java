package com.usa.missiontic.ciclo3.repository;

import com.usa.missiontic.ciclo3.entities.Category;
import com.usa.missiontic.ciclo3.entities.Product;
import com.usa.missiontic.ciclo3.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRepository.getAll();
    }
    public Optional<Category> getCategory (int id) {
        return categoryCrudRepository.findById(id);
    }
    public Category save (Category p) {
        return categoryCrudRepository.save(p);
        }
        public void delete (Category p) {
        categoryCrudRepository.delete(p);
        }
}
