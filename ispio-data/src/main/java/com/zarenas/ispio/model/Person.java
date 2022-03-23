package com.zarenas.ispio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.text.DateFormat;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long person_id;
    private String firstName;
    private String secondName;
    private String maidenName;
    private String lastName;
    private String legalID;
    private DateFormat dobirth;
    boolean personState = true;


    public Person(Long super_id, Long person_id, String firstName, String secondName, String maidenName, String lastName, String legalID, DateFormat dobirth) {
        super(super_id);
        this.person_id = person_id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.maidenName = maidenName;
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
                ", maidemName='" + maidenName + '\'' +
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

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
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
