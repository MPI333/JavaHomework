package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityContactRoles;

public class DatabaseOpportunityContactRoles {

    private IdentityMapOpportunityContactRoles identityMapOpportunityContactRoles;

    public DatabaseOpportunityContactRoles() {
    }

    public DatabaseOpportunityContactRoles(IdentityMapOpportunityContactRoles identityMapOpportunityContactRoles) {
        this.identityMapOpportunityContactRoles = identityMapOpportunityContactRoles;
    }

    public IdentityMapOpportunityContactRoles getIdentityMapOpportunityContactRoles() {
        return identityMapOpportunityContactRoles;
    }

    public void setIdentityMapOpportunityContactRoles(IdentityMapOpportunityContactRoles identityMapOpportunityContactRoles) {
        this.identityMapOpportunityContactRoles = identityMapOpportunityContactRoles;
    }

    public OpportunityContactRoles finder(Long key) {
        OpportunityContactRoles opportunityContactRole = identityMapOpportunityContactRoles.getOpportunityContactRole(key);

        if (opportunityContactRole == null) {
            // Get opportunityContactRole from database
            identityMapOpportunityContactRoles.addOpportunityContactRole(opportunityContactRole);
        }

        return opportunityContactRole;
    }

}
