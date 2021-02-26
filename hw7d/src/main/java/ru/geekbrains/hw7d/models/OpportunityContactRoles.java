package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "opportunitycontactroles")
public class OpportunityContactRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_name", length = 32, nullable = false)
    private String roleName;

    @OneToOne(mappedBy = "opportunitycontactrole")
    private OpportunityContacts opportunityContact;

    public OpportunityContactRoles() {
    }

    public OpportunityContactRoles(String roleName, OpportunityContacts opportunityContact) {
        this.roleName = roleName;
        this.opportunityContact = opportunityContact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public OpportunityContacts getOpportunityContact() {
        return opportunityContact;
    }

    public void setOpportunityContact(OpportunityContacts opportunityContact) {
        this.opportunityContact = opportunityContact;
    }

}
