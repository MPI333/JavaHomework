package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "opportunitycontacts")
public class OpportunityContacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(optional = false)
    private Opportunities opportunity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "opportunitycontactrole_id", referencedColumnName = "id")
    private OpportunityContactRoles opportunityContactRole;

    public OpportunityContacts() {
    }

    public OpportunityContacts(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Opportunities getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunities opportunity) {
        this.opportunity = opportunity;
    }

    public OpportunityContactRoles getOpportunityContactRole() {
        return opportunityContactRole;
    }

    public void setOpportunityContactRole(OpportunityContactRoles opportunityContactRole) {
        this.opportunityContactRole = opportunityContactRole;
    }

}
