package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "leads")
public class Leads {

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

    @Column(name = "address", length = 128, nullable = false)
    private String address;

    @OneToOne(mappedBy = "lead")
    private Contacts contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "leadsource_id", referencedColumnName = "id")
    private LeadSource leadSource;

    public Leads() {
    }

    public Leads(String firstName, String lastName, String phone,
                 String email, String address, Contacts contact, LeadSource leadSource) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.leadSource = leadSource;
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

}
