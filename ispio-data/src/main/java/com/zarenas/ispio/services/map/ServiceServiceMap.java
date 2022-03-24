package com.zarenas.ispio.services.map;

import com.zarenas.ispio.model.Service;
import com.zarenas.ispio.services.CrudService;

import java.util.Set;

public class ServiceServiceMap extends AbstractMapService<Service,Long> implements CrudService<Service,Long> {

    @Override
    public Set<Service> findAll() {
        return super.findAll();
    }

    @Override
    public Service findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Service save(Service object) {
        return super.save(object.getSuper_id(), object);
    }

    @Override
    public void delete(Service object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
