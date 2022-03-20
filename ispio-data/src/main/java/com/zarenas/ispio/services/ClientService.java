package com.zarenas.ispio.services;



import com.zarenas.ispio.model.Client;

import java.util.Set;

public interface ClientService {

    Client findById(Long client_id);

    Client save(Client client);

    Set<Client> findAll();


}
