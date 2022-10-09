package com.usa.missiontic.ciclo3.controller;


import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.entities.Reservation;
import com.usa.missiontic.ciclo3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping ("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p) {
        return reservationService.save(p);
    }

    }

