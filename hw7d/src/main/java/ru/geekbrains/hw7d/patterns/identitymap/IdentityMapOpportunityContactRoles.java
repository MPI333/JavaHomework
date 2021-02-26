package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityContactRoles;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapOpportunityContactRoles {

    private Map opportunityContactRolesMap = new HashMap();

    public IdentityMapOpportunityContactRoles() {
    }

    public void addOpportunityContactRole(OpportunityContactRoles opportunityContactRole) {
        opportunityContactRolesMap.put(opportunityContactRole.getId(), opportunityContactRole);
    }

    public OpportunityContactRoles getOpportunityContactRole(Long key) {
        return (OpportunityContactRoles)opportunityContactRolesMap.get(key);
    }

}
