package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Objects;

public class TvInstalation extends TvService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tvInstalation_id;
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
    private Long instalationCost;
    private Long extracoaxcable;
    private DateFormat instalationDate;

    private Long subtotal;
    private Long total;
    boolean installationState = true;

    public TvInstalation() {
    }

    public TvInstalation(Long tvInstalation_id, String name, String description, String type, String onumodel, String miniNode, String extraamplifier, String onumac, String installTec, Long splitters, Long tacs, Long instalationCost, Long extracoaxcable, DateFormat instalationDate, Long subtotal, Long total, boolean installationState) {
        this.tvInstalation_id = tvInstalation_id;
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
        this.instalationCost = instalationCost;
        this.extracoaxcable = extracoaxcable;
        this.instalationDate = instalationDate;
        this.subtotal = subtotal;
        this.total = total;
        this.installationState = installationState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvInstalation that = (TvInstalation) o;
        return Objects.equals(tvInstalation_id, that.tvInstalation_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tvInstalation_id);
    }

    @Override
    public String toString() {
        return "TvInstalation{" +
                "tvInstalation_id=" + tvInstalation_id +
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
                ", instalationCost=" + instalationCost +
                ", extracoaxcable=" + extracoaxcable +
                ", instalationDate=" + instalationDate +
                ", subtotal=" + subtotal +
                ", total=" + total +
                ", instalationState=" + installationState +
                '}';
    }

    public Long getTvInstalation_id() {
        return tvInstalation_id;
    }

    public void setTvInstalation_id(Long tvInstalation_id) {
        this.tvInstalation_id = tvInstalation_id;
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

    public Long getInstalationCost() {
        return instalationCost;
    }

    public void setInstalationCost(Long instalationCost) {
        this.instalationCost = instalationCost;
    }

    public Long getExtracoaxcable() {
        return extracoaxcable;
    }

    public void setExtracoaxcable(Long extracoaxcable) {
        this.extracoaxcable = extracoaxcable;
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

    public boolean isInstallationState() {
        return installationState;
    }

    public void setInstallationState(boolean installationState) {
        this.installationState = installationState;
    }
}
