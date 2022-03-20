package com.zarenas.ispio.services;

import com.zarenas.ispio.model.Billing;

import java.util.Set;

public interface BillingService {

    Billing findById(Long billing_id);

    Billing save(Billing billing);

    Set<Billing> findAll();

}
