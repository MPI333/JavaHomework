package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.OpportunityContactRoles;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseOpportunityContactRoles {

    private IdentityMapOpportunityContactRoles identityMapOpportunityContactRoles;

    public OpportunityContactRoles finder(Long key) {
        OpportunityContactRoles opportunityContactRole = identityMapOpportunityContactRoles.getOpportunityContactRole(key);

        if (opportunityContactRole == null) {
            // Get opportunityContactRole from database
            identityMapOpportunityContactRoles.addOpportunityContactRole(opportunityContactRole);
        }

        return opportunityContactRole;
    }

}
