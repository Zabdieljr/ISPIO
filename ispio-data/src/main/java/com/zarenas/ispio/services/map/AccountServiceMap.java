package com.zarenas.ispio.services.map;
import com.zarenas.ispio.model.Account;
import com.zarenas.ispio.services.CrudService;

import java.util.Set;

public class AccountServiceMap extends AbstractMapService<Account,Long> implements CrudService<Account,Long> {

    @Override
    public Set<Account> findAll() {
        return super.findAll();
    }

    @Override
    public Account findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Account save(Account object) {
        return super.save(object.getSuper_id(), object);
    }

    @Override
    public void delete(Account object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
