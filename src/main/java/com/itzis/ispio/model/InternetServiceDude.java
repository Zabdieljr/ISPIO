package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class InternetServiceDude extends Service{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dude_id;
    private String name;
    private String description;
    private String type;
    private String gateWayIp;
    private String clientStaticIp;
    private String oltip;
    private String oltgpon;
    private String napIp;
    private String napPort;
    private String onuGponPort;
    private String pppoeDescription;
    boolean serviceState= true;

    public InternetServiceDude() {
    }

    public InternetServiceDude(Long dude_id, String name, String description, String type, String gateWayIp, String clientStaticIp, String oltip, String oltgpon, String napIp, String napPort, String onuGponPort, String pppoeDescription, boolean serviceState) {
        this.dude_id = dude_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.gateWayIp = gateWayIp;
        this.clientStaticIp = clientStaticIp;
        this.oltip = oltip;
        this.oltgpon = oltgpon;
        this.napIp = napIp;
        this.napPort = napPort;
        this.onuGponPort = onuGponPort;
        this.pppoeDescription = pppoeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternetServiceDude that = (InternetServiceDude) o;
        return Objects.equals(dude_id, that.dude_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dude_id);
    }

    @Override
    public String toString() {
        return "InternetServiceDude{" +
                "dude_id=" + dude_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", gateWayIp='" + gateWayIp + '\'' +
                ", clientStaticIp='" + clientStaticIp + '\'' +
                ", oltip='" + oltip + '\'' +
                ", oltgpon='" + oltgpon + '\'' +
                ", napIp='" + napIp + '\'' +
                ", napPort='" + napPort + '\'' +
                ", onuGponPort='" + onuGponPort + '\'' +
                ", pppoeDescription='" + pppoeDescription + '\'' +
                '}';
    }

    public Long getDude_id() {
        return dude_id;
    }

    public void setDude_id(Long dude_id) {
        this.dude_id = dude_id;
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

    public String getGateWayIp() {
        return gateWayIp;
    }

    public void setGateWayIp(String gateWayIp) {
        this.gateWayIp = gateWayIp;
    }

    public String getClientStaticIp() {
        return clientStaticIp;
    }

    public void setClientStaticIp(String clientStaticIp) {
        this.clientStaticIp = clientStaticIp;
    }

    public String getOltip() {
        return oltip;
    }

    public void setOltip(String oltip) {
        this.oltip = oltip;
    }

    public String getOltgpon() {
        return oltgpon;
    }

    public void setOltgpon(String oltgpon) {
        this.oltgpon = oltgpon;
    }

    public String getNapIp() {
        return napIp;
    }

    public void setNapIp(String napIp) {
        this.napIp = napIp;
    }

    public String getNapPort() {
        return napPort;
    }

    public void setNapPort(String napPort) {
        this.napPort = napPort;
    }

    public String getOnuGponPort() {
        return onuGponPort;
    }

    public void setOnuGponPort(String onuGponPort) {
        this.onuGponPort = onuGponPort;
    }

    public String getPppoeDescription() {
        return pppoeDescription;
    }

    public void setPppoeDescription(String pppoeDescription) {
        this.pppoeDescription = pppoeDescription;
    }

    public boolean isServiceState() {
        return serviceState;
    }

    public void setServiceState(boolean serviceState) {
        this.serviceState = serviceState;
    }
}
