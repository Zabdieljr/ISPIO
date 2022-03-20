package com.zarenas.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

public class TvInstallation extends TvService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tvInstallation_id;
    private String name;
    private String description;
    private String type;
    private String onumodel;
    private String miniNode;
    private String extraamplifier;
    private String onumac;
    private String installTec;
    private Long splitters;
    private Long tacs;
    private Long installationCost;
    private Long extracoaxcable;
    private LocalDate tvInstCreated;
    private LocalDate tvInstExecuted;
    private Long subtotal;
    private Long total;
    boolean installationState = true;

    public TvInstallation() {
    }

    public TvInstallation(Long tvInstalation_id, String name, String description, String type, String onumodel, String miniNode, String extraamplifier, String onumac, String installTec, Long splitters, Long tacs, Long instalationCost, Long extracoaxcable,  Long subtotal, Long total, LocalDate tvInstCreated, LocalDate tvInstExecuted, boolean installationState) {
        this.tvInstallation_id = tvInstalation_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.onumodel = onumodel;
        this.miniNode = miniNode;
        this.extraamplifier = extraamplifier;
        this.onumac = onumac;
        this.installTec = installTec;
        this.splitters = splitters;
        this.tacs = tacs;
        this.installationCost = instalationCost;
        this.extracoaxcable = extracoaxcable;
        this.subtotal = subtotal;
        this.total = total;
        this.tvInstCreated = tvInstCreated;
        this.tvInstExecuted = tvInstExecuted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvInstallation that = (TvInstallation) o;
        return Objects.equals(tvInstallation_id, that.tvInstallation_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tvInstallation_id);
    }

    @Override
    public String toString() {
        return "TvInstalation{" +
                "tvInstalation_id=" + tvInstallation_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", onumodel='" + onumodel + '\'' +
                ", miniNode='" + miniNode + '\'' +
                ", extraamplifier='" + extraamplifier + '\'' +
                ", onumac='" + onumac + '\'' +
                ", installTec='" + installTec + '\'' +
                ", splitters=" + splitters +
                ", tacs=" + tacs +
                ", instalationCost=" + installationCost +
                ", extracoaxcable=" + extracoaxcable +
                ", subtotal=" + subtotal +
                ", total=" + total +
                ", instalationState=" + installationState +
                '}';
    }

    public Long getTvInstallation_id() {
        return tvInstallation_id;
    }

    public void setTvInstallation_id(Long tvInstallation_id) {
        this.tvInstallation_id = tvInstallation_id;
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

    public LocalDate getTvInstCreated() {
        return tvInstCreated;
    }

    public void setTvInstCreated(LocalDate tvInstCreated) {
        this.tvInstCreated = tvInstCreated;
    }

    public LocalDate getTvInstExecuted() {
        return tvInstExecuted;
    }

    public void setTvInstExecuted(LocalDate tvInstExecuted) {
        this.tvInstExecuted = tvInstExecuted;
    }

    public String getOnumodel() {
        return onumodel;
    }

    public void setOnumodel(String onumodel) {
        this.onumodel = onumodel;
    }

    public String getMiniNode() {
        return miniNode;
    }

    public void setMiniNode(String miniNode) {
        this.miniNode = miniNode;
    }

    public String getExtraamplifier() {
        return extraamplifier;
    }

    public void setExtraamplifier(String extraamplifier) {
        this.extraamplifier = extraamplifier;
    }

    public String getOnumac() {
        return onumac;
    }

    public void setOnumac(String onumac) {
        this.onumac = onumac;
    }

    public String getInstallTec() {
        return installTec;
    }

    public void setInstallTec(String installTec) {
        this.installTec = installTec;
    }

    public Long getSplitters() {
        return splitters;
    }

    public void setSplitters(Long splitters) {
        this.splitters = splitters;
    }

    public Long getTacs() {
        return tacs;
    }

    public void setTacs(Long tacs) {
        this.tacs = tacs;
    }

    public Long getInstallationCost() {
        return installationCost;
    }

    public void setInstallationCost(Long installationCost) {
        this.installationCost = installationCost;
    }

    public Long getExtracoaxcable() {
        return extracoaxcable;
    }

    public void setExtracoaxcable(Long extracoaxcable) {
        this.extracoaxcable = extracoaxcable;
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
