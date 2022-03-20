package com.zarenas.ispio.services;


import com.zarenas.ispio.model.Service;

import java.util.Set;

public interface ServiceService {

    Service findById(Long service_id);

    Service save(Service service);

    Set<Service> findAll();


}
