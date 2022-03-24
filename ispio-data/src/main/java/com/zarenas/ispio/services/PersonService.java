package com.zarenas.ispio.services;

import com.zarenas.ispio.model.Person;

import java.util.List;

public interface PersonService extends CrudService<Person, Long> {

    Person findByPersonId(Long person_id);
    Person findByLastName(String lastName);

    List<Person> findAllByLastNameLike(String lastName);

}
