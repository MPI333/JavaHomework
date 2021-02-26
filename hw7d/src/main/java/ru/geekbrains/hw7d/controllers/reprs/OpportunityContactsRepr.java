package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.models.OpportunityContactRoles;
import ru.geekbrains.hw7d.models.OpportunityContacts;

import java.util.Objects;

public class OpportunityContactsRepr {

    private Long id;

    private Opportunities opportunity;

    private OpportunityContactRoles opportunityContactRole;

    public OpportunityContactsRepr() {
    }

    public OpportunityContactsRepr(OpportunityContacts opportunityContact) {
        this.id = opportunityContact.getId();
        this.opportunity = opportunityContact.getOpportunity();
        this.opportunityContactRole = opportunityContact.getOpportunityContactRole();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpportunityContactsRepr that = (OpportunityContactsRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
