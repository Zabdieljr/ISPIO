package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Objects;

public class TecSupport extends Service{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long support_id;
    private String name;
    private String description;
    private String tec_Id;
    private String tecName;
    private DateFormat supportDate;
    boolean supportState= true;

    public TecSupport() {
    }

    public TecSupport(Long support_id, String name, String description, String tec_Id, String tecName, DateFormat supportDate, boolean supportState) {
        this.support_id = support_id;
        this.name = name;
        this.description = description;
        this.tec_Id = tec_Id;
        this.tecName = tecName;
        this.supportDate = supportDate;
        this.supportState = supportState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TecSupport that = (TecSupport) o;
        return Objects.equals(support_id, that.support_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), support_id);
    }

    @Override
    public String toString() {
        return "TecSupport{" +
                "support_id=" + support_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tec_Id='" + tec_Id + '\'' +
                ", tecName='" + tecName + '\'' +
                ", supportDate=" + supportDate +
                ", supportState=" + supportState +
                '}';
    }

    public Long getSupport_id() {
        return support_id;
    }

    public void setSupport_id(Long support_id) {
        this.support_id = support_id;
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

    public String getTec_Id() {
        return tec_Id;
    }

    public void setTec_Id(String tec_Id) {
        this.tec_Id = tec_Id;
    }

    public String getTecName() {
        return tecName;
    }

    public void setTecName(String tecName) {
        this.tecName = tecName;
    }

    public DateFormat getSupportDate() {
        return supportDate;
    }

    public void setSupportDate(DateFormat supportDate) {
        this.supportDate = supportDate;
    }

    public boolean isSupportState() {
        return supportState;
    }

    public void setSupportState(boolean supportState) {
        this.supportState = supportState;
    }
}
