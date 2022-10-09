package com.usa.missiontic.ciclo3.controller;


import com.usa.missiontic.ciclo3.entities.Client;
import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping ("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Client save(@RequestBody Client p) {
        return clientService.save(p);
    }

    }

