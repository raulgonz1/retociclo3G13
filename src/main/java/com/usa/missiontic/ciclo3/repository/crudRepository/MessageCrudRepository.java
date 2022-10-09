package com.usa.missiontic.ciclo3.repository.crudRepository;

import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.entities.Message;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface MessageCrudRepository extends CrudRepository <Message, Id> {
    Object getAll();
}
