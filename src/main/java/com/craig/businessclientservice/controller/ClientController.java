package com.craig.businessclientservice.controller;

import com.craig.businessclientservice.model.Client;
import com.craig.businessclientservice.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/allClients")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping("/avgAgeClient")
    public Integer avg(Integer age) {
        return clientService.avg(age);

    }

    @PostMapping("/newClient")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }


}
