package com.zarenas.ispio.services;

import com.zarenas.ispio.model.InternetInstallation;


import java.util.Set;

public interface InternetInstallationService {

    InternetInstallation findById(Long installation_id);

    InternetInstallation save(InternetInstallation internetInstallation);

    Set<InternetInstallation> findAll();
}
