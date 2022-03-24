package com.zarenas.ispio.services.map;
  import com.zarenas.ispio.model.Billing;
  import com.zarenas.ispio.services.CrudService;

  import java.util.Set;

public class BillingServiceMap extends AbstractMapService<Billing,Long> implements CrudService<Billing,Long> {

    @Override
    public Set<Billing> findAll() {
        return super.findAll();
    }

    @Override
    public Billing findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Billing save(Billing object) {
        return super.save(object.getSuper_id(), object);
    }

    @Override
    public void delete(Billing object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

