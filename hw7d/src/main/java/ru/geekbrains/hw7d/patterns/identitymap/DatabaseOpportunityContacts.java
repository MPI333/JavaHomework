package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.OpportunityContacts;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseOpportunityContacts {

    private IdentityMapOpportunityContacts identityMapOpportunityContacts;

    public OpportunityContacts finder(Long key) {
        OpportunityContacts opportunityContact = identityMapOpportunityContacts.getOpportunityContact(key);

        if (opportunityContact == null) {
            // Get opportunityContact from database
            identityMapOpportunityContacts.addOpportunityContact(opportunityContact);
        }

        return opportunityContact;
    }

}
