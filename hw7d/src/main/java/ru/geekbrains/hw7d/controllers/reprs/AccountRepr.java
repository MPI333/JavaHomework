package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.models.Activities;
import ru.geekbrains.hw7d.models.Contacts;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class AccountRepr {

    private Long id;

    private String name;

    private String password;

    private BigDecimal balance;

    private String phone;

    private String email;

    private String website;

    private String address;

    private String description;

    private List<Contacts> contactsList;

    private List<Activities> activitiesList;

    public AccountRepr() {
    }

    public AccountRepr(Account account) {
        this.id = account.getId();
        this.name = account.getName();
        this.password = account.getPassword();
        this.balance = account.getBalance();
        this.phone = account.getPhone();
        this.email = account.getEmail();
        this.website = account.getWebsite();
        this.address = account.getAddress();
        this.description = account.getDescription();
        this.contactsList = account.getContactsList();
        this.activitiesList = account.getActivitiesList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    public List<Activities> getActivitiesList() {
        return activitiesList;
    }

    public void setActivitiesList(List<Activities> activitiesList) {
        this.activitiesList = activitiesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountRepr that = (AccountRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
