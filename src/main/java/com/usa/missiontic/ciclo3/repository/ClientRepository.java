package com.usa.missiontic.ciclo3.repository;

import com.usa.missiontic.ciclo3.entities.Client;
import com.usa.missiontic.ciclo3.entities.Product;
import com.usa.missiontic.ciclo3.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.getAll();
    }
    public Optional<Client> getClient (int id) {
        return clientCrudRepository.findById(id);
    }
    public Client save (Client p) {return clientCrudRepository.save(p);}
        public void delete (Client p) {
        clientCrudRepository.delete(p);
        }
}
