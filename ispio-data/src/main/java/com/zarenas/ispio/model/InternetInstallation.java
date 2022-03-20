package com.zarenas.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

public class InternetInstallation extends InternetService{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long installation_id;
    private String name;
    private String description;
    private String type;
    private String onumodel;
    private String extrarouter;
    private String onumac;
    private Long installationCost;
    private Long extrafiber;
    private LocalDate intInstCreated;
    private LocalDate intInstExecuted;
    private Long subtotal;
    private Long total;
    boolean installationState = true;

    public InternetInstallation() {
    }

    public InternetInstallation(Long installation_id, String name, String description, String type, String onumodel, String extrarouter, String onumac, Long instalationCost, Long extrafiber, LocalDate intInstCreated,LocalDate intInstExecuted, Long subtotal, Long total) {
        this.installation_id = installation_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.onumodel = onumodel;
        this.extrarouter = extrarouter;
        this.onumac = onumac;
        this.installationCost = instalationCost;
        this.extrafiber = extrafiber;
        this.subtotal = subtotal;
        this.total = total;
        this.intInstCreated = intInstCreated;
        this.intInstExecuted = intInstExecuted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternetInstallation that = (InternetInstallation) o;
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
                ", installationCost=" + installationCost +
                ", extrafiber=" + extrafiber +
                ", installationCreated=" + intInstCreated +
                ", installationexecuted=" + intInstExecuted +
                ", subtotal=" + subtotal +
                ", total=" + total +
                ", installationState=" + installationState +
                '}';
    }

    public LocalDate getIntInstCreated() {
        return intInstCreated;
    }

    public void setIntInstCreated(LocalDate intInstCreated) {
        this.intInstCreated = intInstCreated;
    }

    public LocalDate getIntInstExecuted() {
        return intInstExecuted;
    }

    public void setIntInstExecuted(LocalDate intInstExecuted) {
        this.intInstExecuted = intInstExecuted;
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

    public Long getInstallationCost() {
        return installationCost;
    }

    public void setInstallationCost(Long installationCost) {
        this.installationCost = installationCost;
    }

    public Long getExtrafiber() {
        return extrafiber;
    }

    public void setExtrafiber(Long extrafiber) {
        this.extrafiber = extrafiber;
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

    public boolean isInstallationState() {
        return installationState;
    }

    public void setInstallationState(boolean installationState) {
        this.installationState = installationState;
    }
}
