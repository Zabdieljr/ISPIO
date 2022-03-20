package com.zarenas.ispio.services;

import com.zarenas.ispio.model.Person;

import java.util.Set;

public interface PersonService {
    Person findByIdLegalID(String legal_ID);

    Person findByLastName(String lastName);

    Person findById(Long person_id);

    Person save(Person person);

    Set<Person> findAll();

}
