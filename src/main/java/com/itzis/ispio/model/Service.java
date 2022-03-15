package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Service extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long service_id;
    private String name;
    private String description;
    private String type;
    private Long price;
    private DateFormat serviceDate;
    boolean accountState= true;
    final private Set<Service> services = new HashSet<>();

    public Service() {
    }

    public Service(Long service_id, String name, String description, String type, Long price, DateFormat serviceDate, boolean accountState) {
        this.service_id = service_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.serviceDate = serviceDate;
        this.accountState = accountState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Service service = (Service) o;
        return Objects.equals(service_id, service.service_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), service_id);
    }

    @Override
    public String toString() {
        return "Service{" +
                "service_id=" + service_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", serviceDate=" + serviceDate +
                ", accountState=" + accountState +
                ", services=" + services +
                '}';
    }

    public Long getService_id() {
        return service_id;
    }

    public void setService_id(Long service_id) {
        this.service_id = service_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public DateFormat getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(DateFormat serviceDate) {
        this.serviceDate = serviceDate;
    }

    public boolean isAccountState() {
        return accountState;
    }

    public void setAccountState(boolean accountState) {
        this.accountState = accountState;
    }

    public Set<Service> getServices() {
        return services;
    }

}
