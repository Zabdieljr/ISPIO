package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Objects;

public class InternetService extends Service{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long internetService_id;
    private String name;
    private String description;
    private String type;
    private String protocol;
    private DateFormat serviceStartDate;

    private Long price;
    boolean internetState= true;

    public InternetService() {
    }

    public InternetService(Long internetService_id, String name, String description, String type, String protocol, DateFormat serviceStartDate, Long price, boolean internetState) {
        this.internetService_id = internetService_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.protocol = protocol;
        this.serviceStartDate = serviceStartDate;
        this.price = price;
        this.internetState = internetState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternetService that = (InternetService) o;
        return Objects.equals(internetService_id, that.internetService_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), internetService_id);
    }

    @Override
    public String toString() {
        return "InternetService{" +
                "internetService_id=" + internetService_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", protocol='" + protocol + '\'' +
                ", serviceStartDate=" + serviceStartDate +
                ", price=" + price +
                ", internetState=" + internetState +
                '}';
    }

    public Long getInternetService_id() {
        return internetService_id;
    }

    public void setInternetService_id(Long internetService_id) {
        this.internetService_id = internetService_id;
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public DateFormat getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(DateFormat serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public boolean isInternetState() {
        return internetState;
    }

    public void setInternetState(boolean internetState) {
        this.internetState = internetState;
    }
}
