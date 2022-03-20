package com.zarenas.ispio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long account_id;
    private String name;
    private String description;
    private String type;
    private Long balance;
    boolean accountState=true;
    private DateFormat accountDate;
    final private Set<Account> accounts = new HashSet<>();

    public Account(Long account_id, String name, String description, String type, Long balance, DateFormat accountDate, Set<Account> accounts) {
        this.account_id = account_id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.balance = balance;
        this.accountDate = accountDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(account_id, account.account_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account_id);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + account_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }

    public DateFormat getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(DateFormat accountDate) {
        this.accountDate = accountDate;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
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

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public boolean isAccountState() {
        return accountState;
    }

    public void setAccountState(boolean accountState) {
        this.accountState = accountState;
    }
}
