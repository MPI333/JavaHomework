package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.models.Leads;
import ru.geekbrains.hw7d.models.Opportunities;

import java.util.List;
import java.util.Objects;

public class ContactsRepr {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String website;

    private String address;

    private String description;

    private Account account;

    private List<Opportunities> opportunitiesList;

    private Leads lead;

    public ContactsRepr() {
    }

    public ContactsRepr(Contacts contact) {
        this.id = contact.getId();
        this.firstName = contact.getFirstName();
        this.lastName = contact.getLastName();
        this.phone = contact.getPhone();
        this.email = contact.getEmail();
        this.website = contact.getWebsite();
        this.address = contact.getAddress();
        this.description = contact.getDescription();
        this.account = contact.getAccount();
        this.opportunitiesList = contact.getOpportunitiesList();
        this.lead = contact.getLead();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Opportunities> getOpportunitiesList() {
        return opportunitiesList;
    }

    public void setOpportunitiesList(List<Opportunities> opportunitiesList) {
        this.opportunitiesList = opportunitiesList;
    }

    public Leads getLead() {
        return lead;
    }

    public void setLead(Leads lead) {
        this.lead = lead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactsRepr that = (ContactsRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
