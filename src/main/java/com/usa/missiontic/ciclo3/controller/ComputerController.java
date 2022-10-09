package com.usa.missiontic.ciclo3.controller;


import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping ("/all")
    public List<Computer> getAll(){
        return computerService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Computer save(@RequestBody Computer p) {
        return computerService.save(p);
    }

    }

