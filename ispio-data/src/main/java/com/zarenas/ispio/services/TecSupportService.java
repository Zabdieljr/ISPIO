package com.zarenas.ispio.services;

import com.zarenas.ispio.model.TecSupport;

import java.util.Set;

public interface TecSupportService {
    TecSupport findById(Long support_id);

    TecSupport save(TecSupport tecSupport);

    Set<TecSupport> findAll();
}
