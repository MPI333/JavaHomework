package ru.geekbrains.hw7d.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 128, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 128, nullable = false)
    private String lastName;

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

    @ManyToOne(optional = false)
    private Account account;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Opportunities> opportunitiesList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    private Leads lead;

    public Contacts() {
    }

    public Contacts(String firstName, String lastName, String phone,
                    String email, String website, String address, String description,
                    Account account, List<Opportunities> opportunitiesList, Leads lead) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.address = address;
        this.description = description;
        this.account = account;
        this.opportunitiesList = opportunitiesList;
        this.lead = lead;
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

}
