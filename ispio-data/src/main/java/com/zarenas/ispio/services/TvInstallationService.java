package com.zarenas.ispio.services;

import com.zarenas.ispio.model.TvInstallation;

import java.util.Set;

public interface TvInstallationService {

    TvInstallation findById(Long tvInstallation_id);

    TvInstallation save(TvInstallation tvInstallation);

    Set<TvInstallation> findAll();
}
