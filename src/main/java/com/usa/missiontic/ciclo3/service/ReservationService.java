package com.usa.missiontic.ciclo3.service;

import com.usa.missiontic.ciclo3.entities.Computer;
import com.usa.missiontic.ciclo3.entities.Reservation;
import com.usa.missiontic.ciclo3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll() {
        return reservationRepository.getAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationRepository.getReservation(id);
    }

    public Reservation save(Reservation p) {
        if (p.getIdClient() == null) {
            return reservationRepository.save(p);
        } else {
            Optional<Reservation> e = reservationRepository.getReservation(p.getIdClient());
            if (e.isPresent()) {
                return p;
            }
        }
        return p;
    }

    public Reservation update(Reservation p) {
        if (p.getIdClient() == null) {
            Optional<Reservation> q = reservationRepository.getReservation(p.getIdClient());
            if (q.isPresent()) {
                if (p.getStartDate() != null) {
                    q.get().setStartDate(p.getStartDate());
                }
                if (p.getDevolutionDate() != null) {
                    q.get().setDevolutionDate(p.getDevolutionDate());
                }
                if (p.getComputer() != null) {
                    q.get().setComputer(p.getComputer());
                }
                if (p.getCategory() != null) {
                    q.get().setCategory(p.getCategory());
                }
                reservationRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        }
        return p;

    }

    public boolean delete (int id){
        boolean flag=false;
        Optional<Reservation> p = reservationRepository.getReservation(id);
        if (p.isPresent()) {
            reservationRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }

}