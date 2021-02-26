package ru.geekbrains.hw7d.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "password", length = 128, nullable = false)
    private String password;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "phone", length = 32, nullable = false)
    private String phone;

    @Column(name = "email", length = 32, nullable = false)
    private String email;

    @Column(name = "website", length = 128, nullable = false)
    private String website;

    @Column(name = "address", length = 128, nullable = false)
    private String address;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Contacts> contactsList;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Activities> activitiesList;

    public Account() {
    }

    public Account(String name, String password, BigDecimal balance,
                   String phone, String email, String website, String address,
                   String description, List<Contacts> contactsList, List<Activities> activitiesList) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.address = address;
        this.description = description;
        this.contactsList = contactsList;
        this.activitiesList = activitiesList;
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

}
