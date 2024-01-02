package com.itau.itau.project.services;

import com.itau.itau.project.entity.Client;
import com.itau.itau.project.entity.dto.ClientDTO;
import com.itau.itau.project.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public Client saveClient(ClientDTO clientDTO){
    Client client = new Client();

    client.setFirstName(clientDTO.firstName());
    client.setLastName(clientDTO.lastName());
    client.setParticipation(clientDTO.participation());

        if(client == null || client.getFirstName() == null
                || client.getLastName() == null ||
                client.getParticipation() == null ){
            throw new NullPointerException();
        }

    return clientRepository.save(client);
}


public List<Client> listAllClients(){

      List<Client> allClients = clientRepository.findAll();

      if(allClients == null){
          throw new NullPointerException();
      }
      return allClients;
}


}
