package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.models.LeadSource;
import ru.geekbrains.hw7d.models.Leads;

import java.util.Objects;

public class LeadsRepr {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String address;

    private Contacts contact;

    private LeadSource leadSource;

    public LeadsRepr() {
    }

    public LeadsRepr(Leads lead) {
        this.id = lead.getId();
        this.firstName = lead.getFirstName();
        this.lastName = lead.getLastName();
        this.phone = lead.getPhone();
        this.email = lead.getEmail();
        this.address = lead.getAddress();
        this.contact = lead.getContact();
        this.leadSource = lead.getLeadSource();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(LeadSource leadSource) {
        this.leadSource = leadSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeadsRepr leadsRepr = (LeadsRepr) o;
        return Objects.equals(id, leadsRepr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
