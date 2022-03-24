package com.zarenas.ispio.services;


import com.zarenas.ispio.model.Client;
import com.zarenas.ispio.model.Service;

import java.util.List;
import java.util.Set;

public interface ServiceService extends CrudService<Service, Long> {


    Service findByLastName(String lastName);

    List<Client> findAllByLastNameLike(String name);

    Service findById(Long service_id);

    Service save(Service service);


}
