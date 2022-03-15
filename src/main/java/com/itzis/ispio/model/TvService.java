package com.itzis.ispio.model;

import java.text.DateFormat;
import java.util.Objects;

public class TvService extends Service{

    private Long tvService_id;
    private String name;
    private String description;
    private String type;
    private String protocol;
    private String channels;
    private Long price;
    private Long discount;
    private Long tvCount;
    boolean tvState= true;
    private DateFormat servicestartDate;

    public TvService() {
    }

    public TvService(Long tvService_id, String name, String description, String type, String protocol, String channels, Long price, Long discount, Long tvCount, boolean tvState, DateFormat servicestartDate) {
        this.tvService_id = tvService_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.protocol = protocol;
        this.channels = channels;
        this.price = price;
        this.discount = discount;
        this.tvCount = tvCount;
        this.tvState = tvState;
        this.servicestartDate = servicestartDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvService tvService = (TvService) o;
        return Objects.equals(tvService_id, tvService.tvService_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tvService_id);
    }

    @Override
    public String toString() {
        return "TvService{" +
                "tvService_id=" + tvService_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", protocol='" + protocol + '\'' +
                ", channels='" + channels + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", tvCount=" + tvCount +
                ", tvState=" + tvState +
                ", servicestartDate=" + servicestartDate +
                '}';
    }

    public Long getTvService_id() {
        return tvService_id;
    }

    public void setTvService_id(Long tvService_id) {
        this.tvService_id = tvService_id;
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getTvCount() {
        return tvCount;
    }

    public void setTvCount(Long tvCount) {
        this.tvCount = tvCount;
    }

    public boolean isTvState() {
        return tvState;
    }

    public void setTvState(boolean tvState) {
        this.tvState = tvState;
    }

    public DateFormat getServicestartDate() {
        return servicestartDate;
    }

    public void setServicestartDate(DateFormat servicestartDate) {
        this.servicestartDate = servicestartDate;
    }
}
