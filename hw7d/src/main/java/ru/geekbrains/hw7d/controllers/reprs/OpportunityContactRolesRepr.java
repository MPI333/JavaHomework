package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.OpportunityContactRoles;
import ru.geekbrains.hw7d.models.OpportunityContacts;

import java.util.Objects;

public class OpportunityContactRolesRepr {

    private Long id;

    private String roleName;

    private OpportunityContacts opportunityContact;

    public OpportunityContactRolesRepr() {
    }

    public OpportunityContactRolesRepr(OpportunityContactRoles opportunityContactRole) {
        this.id = opportunityContactRole.getId();
        this.roleName = opportunityContactRole.getRoleName();
        this.opportunityContact = opportunityContactRole.getOpportunityContact();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpportunityContactRolesRepr that = (OpportunityContactRolesRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
