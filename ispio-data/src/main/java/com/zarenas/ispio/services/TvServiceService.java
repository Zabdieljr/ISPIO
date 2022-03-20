package com.zarenas.ispio.services;

import com.zarenas.ispio.model.TvService;

import java.util.Set;

public interface TvServiceService {
    TvService findById(Long tvService_id);

    TvService save(TvService tvService);

    Set<TvService> findAll();
}
