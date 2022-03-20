package com.zarenas.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long client_id;
    private String clientType;
    private String mainProviderName;
    boolean mainServiceProvider= true;
    private String phone;
    private String phone2;
    private String email;
    private String street;
    private String sector;
    private String city;
    private String state;
    private String estratus;

    boolean thirPartyService= false;
    private String thirdProviderName;
    final private Set<Client> clients = new HashSet<>();

    public Client() {
    }

    public Client(Long client_id, String clientType, String mainProviderName, String phone, String phone2, String email, String street, String sector, String city, String state, String estratus, String thirdProviderName) {
        this.client_id = client_id;
        this.clientType = clientType;
        this.mainProviderName = mainProviderName;
        this.phone = phone;
        this.phone2 = phone2;
        this.email = email;
        this.street = street;
        this.sector = sector;
        this.city = city;
        this.state = state;
        this.estratus = estratus;
        this.thirdProviderName = thirdProviderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(client_id, client.client_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), client_id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", clientType='" + clientType + '\'' +
                ", mainProviderName='" + mainProviderName + '\'' +
                ", mainServiceProvider=" + mainServiceProvider +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", sector='" + sector + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", estratus='" + estratus + '\'' +
                ", thirPartyService=" + thirPartyService +
                ", thirdProviderName='" + thirdProviderName + '\'' +
                ", clients=" + clients +
                '}';
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getMainProviderName() {
        return mainProviderName;
    }

    public void setMainProviderName(String mainProviderName) {
        this.mainProviderName = mainProviderName;
    }

    public boolean isMainServiceProvider() {
        return mainServiceProvider;
    }

    public void setMainServiceProvider(boolean mainServiceProvider) {
        this.mainServiceProvider = mainServiceProvider;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEstratus() {
        return estratus;
    }

    public void setEstratus(String estratus) {
        this.estratus = estratus;
    }

    public boolean isThirPartyService() {
        return thirPartyService;
    }

    public void setThirPartyService(boolean thirPartyService) {
        this.thirPartyService = thirPartyService;
    }

    public String getThirdProviderName() {
        return thirdProviderName;
    }

    public void setThirdProviderName(String thirdProviderName) {
        this.thirdProviderName = thirdProviderName;
    }

    public Set<Client> getClients() {
        return clients;
    }
}
