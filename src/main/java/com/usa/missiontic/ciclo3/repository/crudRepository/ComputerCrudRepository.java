package com.usa.missiontic.ciclo3.repository.crudRepository;

import com.usa.missiontic.ciclo3.entities.Computer;
import org.springframework.data.repository.CrudRepository;

public interface ComputerCrudRepository extends CrudRepository <Computer, Integer> {
    Object getAll();
}
