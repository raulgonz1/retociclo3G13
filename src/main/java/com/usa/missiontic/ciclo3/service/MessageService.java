package com.usa.missiontic.ciclo3.service;

import com.usa.missiontic.ciclo3.entities.Client;
import com.usa.missiontic.ciclo3.entities.Message;
import com.usa.missiontic.ciclo3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        return messageRepository.getAll();
    }

    public Optional<Message> getClient(int id) {
        return messageRepository.getMessage(id);
    }

    public Message save(Message p) {
        if (p.getIdClient() == null) {
            return messageRepository.save(p);
        } else {
            Optional<Message> e = messageRepository.getMessage(p.getIdClient());
            if (e.isPresent()) {
                return p;
            }
        }
        return p;
    }

    public Message update(Message p) {
        if (p.getIdClient() == null) {
            Optional<Message> q = messageRepository.getMessage(p.getIdClient());
            if (q.isPresent()) {
                if (p.getMessageText() != null) {
                    q.get().setMessageText(p.getMessageText());
                }

                messageRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        }
        return p;

    }

    public boolean delete (int id){
        boolean flag=false;
        Optional<Message> p = messageRepository.getMessage(id);
        if (p.isPresent()) {
            messageRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }

}