package com.itau.itau.project.controller;

import com.itau.itau.project.entity.Client;
import com.itau.itau.project.entity.dto.ClientDTO;
import com.itau.itau.project.services.ClientService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/client")
@RestController
public class clientController {


    @Autowired
    private ClientService clientService;
@PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){
    Client client = clientService.saveClient(clientDTO);
    return ResponseEntity.ok(client);
    }
@GetMapping("/listAll")
    public ResponseEntity<List<Client>> listAllClients(){

    List<Client> clients = clientService.listAllClients();

    return ResponseEntity.ok().body(clients);
    }
}
