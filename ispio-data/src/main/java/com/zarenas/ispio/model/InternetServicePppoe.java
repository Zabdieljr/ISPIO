package com.zarenas.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class InternetServicePppoe extends InternetService{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pppoe_id;
    private String name;
    private String description;
    private String type;
    private String downSpeed;
    private String upSpeed;
    private String pppoeUser;
    private String pppoePassword;
    private String pppoeDescription;
    boolean pppoeState= true;

    public InternetServicePppoe() {
    }

    public InternetServicePppoe(Long pppoe_id, String name, String description, String type, String downSpeed, String upSpeed, String pppoeUser, String pppoePassword, String pppoeDescription) {
        this.pppoe_id = pppoe_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.downSpeed = downSpeed;
        this.upSpeed = upSpeed;
        this.pppoeUser = pppoeUser;
        this.pppoePassword = pppoePassword;
        this.pppoeDescription = pppoeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternetServicePppoe that = (InternetServicePppoe) o;
        return Objects.equals(pppoe_id, that.pppoe_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pppoe_id);
    }

    @Override
    public String toString() {
        return "InternetServicePppoe{" +
                "pppoe_id=" + pppoe_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", downSpeed='" + downSpeed + '\'' +
                ", upSpeed='" + upSpeed + '\'' +
                ", pppoeUser='" + pppoeUser + '\'' +
                ", pppoePasword='" + pppoePassword + '\'' +
                ", pppoeDescription='" + pppoeDescription + '\'' +
                ", pppoeState=" + pppoeState +
                '}';
    }

    public Long getPppoe_id() {
        return pppoe_id;
    }

    public void setPppoe_id(Long pppoe_id) {
        this.pppoe_id = pppoe_id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public String getDownSpeed() {
        return downSpeed;
    }

    public void setDownSpeed(String downSpeed) {
        this.downSpeed = downSpeed;
    }

    public String getUpSpeed() {
        return upSpeed;
    }

    public void setUpSpeed(String upSpeed) {
        this.upSpeed = upSpeed;
    }

    public String getPppoeUser() {
        return pppoeUser;
    }

    public void setPppoeUser(String pppoeUser) {
        this.pppoeUser = pppoeUser;
    }

    public String getPppoePassword() {
        return pppoePassword;
    }

    public void setPppoePassword(String pppoePassword) {
        this.pppoePassword = pppoePassword;
    }

    public String getPppoeDescription() {
        return pppoeDescription;
    }

    public void setPppoeDescription(String pppoeDescription) {
        this.pppoeDescription = pppoeDescription;
    }

    public boolean isPppoeState() {
        return pppoeState;
    }

    public void setPppoeState(boolean pppoeState) {
        this.pppoeState = pppoeState;
    }
}
