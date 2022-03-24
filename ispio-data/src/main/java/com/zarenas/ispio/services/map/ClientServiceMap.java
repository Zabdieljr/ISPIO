package com.zarenas.ispio.services.map;

import com.zarenas.ispio.model.Client;
import com.zarenas.ispio.services.CrudService;

import java.util.Set;

public class ClientServiceMap extends AbstractMapService<Client,Long> implements CrudService<Client,Long> {

    @Override
    public Set<Client> findAll() {
        return super.findAll();
    }

    @Override
    public Client findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Client save(Client object) {
        return super.save(object.getSuper_id(), object);
    }

    @Override
    public void delete(Client object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

