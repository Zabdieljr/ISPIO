package com.zarenas.ispio.services;

import com.zarenas.ispio.model.Account;

import java.util.Set;

public interface AccountService {
    Account findById(Long account_id);

    Account save(Account account);

    Set<Account> findAll();
}
