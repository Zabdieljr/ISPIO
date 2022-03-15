package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long person_id;
    private String firstName;
    private String secondName;
    private String maidemName;
    private String lastName;
    private String legalID;
    private DateFormat dobirth;
    boolean  personState = true;
    final private Set<Person> persons = new HashSet<>();

    public Person() {
    }

    public Person(Long person_id, String firstName, String secondName, String maidemName, String lastName, String legalID, DateFormat dobirth) {
        this.person_id = person_id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.maidemName = maidemName;
        this.lastName = lastName;
        this.legalID = legalID;
        this.dobirth = dobirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(person_id, person.person_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + person_id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", maidemName='" + maidemName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", legalID='" + legalID + '\'' +
                ", dobirth=" + dobirth +
                '}';
    }

    public Long getAccount_id() {
        return person_id;
    }

    public void setAccount_id(Long account_id) {
        this.person_id = account_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMaidemName() {
        return maidemName;
    }

    public void setMaidemName(String maidemName) {
        this.maidemName = maidemName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLegalID() {
        return legalID;
    }

    public void setLegalID(String legalID) {
        this.legalID = legalID;
    }

    public DateFormat getDobirth() {
        return dobirth;
    }

    public void setDobirth(DateFormat dobirth) {
        this.dobirth = dobirth;
    }

    public boolean isPersonState() {
        return personState;
    }

    public void setPersonState(boolean personState) {
        this.personState = personState;
    }
}
