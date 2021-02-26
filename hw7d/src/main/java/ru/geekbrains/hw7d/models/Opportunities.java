package ru.geekbrains.hw7d.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "opportunities")
public class Opportunities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @Column(name = "source", length = 128, nullable = false)
    private String source;

    @Column(name = "status", length = 32, nullable = false)
    private String status;

    @ManyToOne(optional = false)
    private Contacts contact;

    @OneToMany(mappedBy = "opportunity", cascade = CascadeType.ALL)
    private List<OpportunityContacts> opportunityContactsList;

    @OneToMany(mappedBy = "opportunity", cascade = CascadeType.ALL)
    private List<OpportunityProduct> opportunityProductList;

    public Opportunities() {
    }

    public Opportunities(String name, String source, String status,
                         Contacts contact, List<OpportunityContacts> opportunityContactsList,
                         List<OpportunityProduct> opportunityProductList) {
        this.name = name;
        this.source = source;
        this.status = status;
        this.contact = contact;
        this.opportunityContactsList = opportunityContactsList;
        this.opportunityProductList = opportunityProductList;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public List<OpportunityContacts> getOpportunityContactsList() {
        return opportunityContactsList;
    }

    public void setOpportunityContactsList(List<OpportunityContacts> opportunityContactsList) {
        this.opportunityContactsList = opportunityContactsList;
    }

    public List<OpportunityProduct> getOpportunityProductList() {
        return opportunityProductList;
    }

    public void setOpportunityProductList(List<OpportunityProduct> opportunityProductList) {
        this.opportunityProductList = opportunityProductList;
    }

}
