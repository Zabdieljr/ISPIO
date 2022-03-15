package com.itzis.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Billing extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billing_id;
    private String name;
    private String description;
    private String type;
    private Long balance;
    private Long ammount;
    private Long discount;
    private Long interest;
    private Long tax;
    private Long quantity;
    private Long total;
    boolean billingState= true;
    private DateFormat billingDate;
    private Set<Billing> billings = new HashSet<>();

    public Billing(Long account_id, String name, String description, String type, Long balance, boolean accountState, DateFormat accountDate, Set<Account> accounts) {
        super(account_id, name, description, type, balance, accountState, accountDate, accounts);
    }

    public Billing(Long account_id, String name, String description, String type, Long balance, boolean accountState, DateFormat accountDate, Set<Account> accounts, Long billing_id, String name1, String description1, String type1, Long balance1, Long ammount, Long discount, Long interest, Long tax, Long quantity, Long total, boolean billingState, DateFormat billingDate, Set<Billing> billings) {
        super(account_id, name, description, type, balance, accountState, accountDate, accounts);
        this.billing_id = billing_id;
        this.name = name1;
        this.description = description1;
        this.type = type1;
        this.balance = balance1;
        this.ammount = ammount;
        this.discount = discount;
        this.interest = interest;
        this.tax = tax;
        this.quantity = quantity;
        this.total = total;
        this.billingState = billingState;
        this.billingDate = billingDate;
        this.billings = billings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Billing billing = (Billing) o;
        return Objects.equals(billing_id, billing.billing_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), billing_id);
    }

    @Override
    public String toString() {
        return "Billing{" +
                "billing_id=" + billing_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", ammount=" + ammount +
                ", discount=" + discount +
                ", interest=" + interest +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", total=" + total +
                ", billingState=" + billingState +
                ", billingDate=" + billingDate +
                ", billings=" + billings +
                '}';
    }

    public Long getBilling_id() {
        return billing_id;
    }

    public void setBilling_id(Long billing_id) {
        this.billing_id = billing_id;
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

    @Override
    public Long getBalance() {
        return balance;
    }

    @Override
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getAmmount() {
        return ammount;
    }

    public void setAmmount(Long ammount) {
        this.ammount = ammount;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public boolean isBillingState() {
        return billingState;
    }

    public void setBillingState(boolean billingState) {
        this.billingState = billingState;
    }

    public DateFormat getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(DateFormat billingDate) {
        this.billingDate = billingDate;
    }

    public Set<Billing> getBillings() {
        return billings;
    }

    public void setBillings(Set<Billing> billings) {
        this.billings = billings;
    }
}
