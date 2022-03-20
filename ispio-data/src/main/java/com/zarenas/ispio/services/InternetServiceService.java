package com.zarenas.ispio.services;

import com.zarenas.ispio.model.InternetService;

import java.util.Set;

public interface InternetServiceService {

   InternetService findById(Long internetService_id);

    InternetService save(InternetService internetService);

    Set<InternetService> findAll();

}
