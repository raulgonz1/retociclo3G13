package com.usa.missiontic.ciclo3.repository;

import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.repository.crudRepository.ComputerCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComputerRepository {

    @Autowired
    private ComputerCrudRepository computerCrudRepository;

    public List<Computer> getAll() {
        return (List<Computer>) computerCrudRepository.getAll();
    }
    public Optional<Computer> getComputer (int id) {
        return computerCrudRepository.findById(id);
    }
    public Computer save (Computer p) {
        return computerCrudRepository.save(p);
        }
        public void delete (Computer p) {
        computerCrudRepository.delete(p);
        }
}

