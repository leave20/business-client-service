package com.craig.businessclientservice.service;

import com.craig.businessclientservice.model.Client;
import com.craig.businessclientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;


    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Integer avg(Integer age) {
        return clientRepository.avg(age);
    }
}
