package com.zarenas.ispio.services;



import com.zarenas.ispio.model.Client;

import java.util.List;
import java.util.Set;

public interface ClientService extends CrudService<Client, Long> {


    Client findByLastName(String lastName);

    List<Client> findAllByLastNameLike(String lastName);

    Client findById(Long client_id);

    Client save(Client client);

    Set<Client> findAll();


}
