package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Objects;

public class InternetInstalation extends InternetService{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long installation_id;
    private String name;
    private String description;
    private String type;
    private String onumodel;
    private String extrarouter;
    private String onumac;
    private Long instalationCost;
    private Long extrafiber;
    private DateFormat instalationDate;
    private Long subtotal;
    private Long total;
    boolean instalationState= true;

    public InternetInstalation() {
    }

    public InternetInstalation(Long installation_id, String name, String description, String type, String onumodel, String extrarouter, String onumac, Long instalationCost, Long extrafiber, DateFormat instalationDate, Long subtotal, Long total) {
        this.installation_id = installation_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.onumodel = onumodel;
        this.extrarouter = extrarouter;
        this.onumac = onumac;
        this.instalationCost = instalationCost;
        this.extrafiber = extrafiber;
        this.instalationDate = instalationDate;
        this.subtotal = subtotal;
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternetInstalation that = (InternetInstalation) o;
        return Objects.equals(installation_id, that.installation_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), installation_id);
    }

    @Override
    public String toString() {
        return "InternetInstalation{" +
                "installation_id=" + installation_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", onumodel='" + onumodel + '\'' +
                ", extrarouter='" + extrarouter + '\'' +
                ", onumac='" + onumac + '\'' +
                ", instalationCost=" + instalationCost +
                ", extrafiber=" + extrafiber +
                ", instalationDate=" + instalationDate +
                ", subtotal=" + subtotal +
                ", total=" + total +
                ", instalationState=" + instalationState +
                '}';
    }

    public Long getInstallation_id() {
        return installation_id;
    }

    public void setInstallation_id(Long installation_id) {
        this.installation_id = installation_id;
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

    public String getOnumodel() {
        return onumodel;
    }

    public void setOnumodel(String onumodel) {
        this.onumodel = onumodel;
    }

    public String getExtrarouter() {
        return extrarouter;
    }

    public void setExtrarouter(String extrarouter) {
        this.extrarouter = extrarouter;
    }

    public String getOnumac() {
        return onumac;
    }

    public void setOnumac(String onumac) {
        this.onumac = onumac;
    }

    public Long getInstalationCost() {
        return instalationCost;
    }

    public void setInstalationCost(Long instalationCost) {
        this.instalationCost = instalationCost;
    }

    public Long getExtrafiber() {
        return extrafiber;
    }

    public void setExtrafiber(Long extrafiber) {
        this.extrafiber = extrafiber;
    }

    public DateFormat getInstalationDate() {
        return instalationDate;
    }

    public void setInstalationDate(DateFormat instalationDate) {
        this.instalationDate = instalationDate;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public boolean isInstalationState() {
        return instalationState;
    }

    public void setInstalationState(boolean instalationState) {
        this.instalationState = instalationState;
    }
}
