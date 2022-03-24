package com.zarenas.ispio.services;

import com.zarenas.ispio.model.Billing;
import com.zarenas.ispio.model.Client;

import java.util.List;

public interface BillingService extends CrudService<Billing, Long> {


    Billing findByBillingId(Long billing_id);

    List<Billing> findAllByLastNameLike(String lastName);


    Billing save(Billing billing);
}
