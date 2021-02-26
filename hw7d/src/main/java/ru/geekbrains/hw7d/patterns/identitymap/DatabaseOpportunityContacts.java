package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityContacts;

public class DatabaseOpportunityContacts {

    private IdentityMapOpportunityContacts identityMapOpportunityContacts;

    public DatabaseOpportunityContacts() {
    }

    public DatabaseOpportunityContacts(IdentityMapOpportunityContacts identityMapOpportunityContacts) {
        this.identityMapOpportunityContacts = identityMapOpportunityContacts;
    }

    public IdentityMapOpportunityContacts getIdentityMapOpportunityContacts() {
        return identityMapOpportunityContacts;
    }

    public void setIdentityMapOpportunityContacts(IdentityMapOpportunityContacts identityMapOpportunityContacts) {
        this.identityMapOpportunityContacts = identityMapOpportunityContacts;
    }

    public OpportunityContacts finder(Long key) {
        OpportunityContacts opportunityContact = identityMapOpportunityContacts.getOpportunityContact(key);

        if (opportunityContact == null) {
            // Get opportunityContact from database
            identityMapOpportunityContacts.addOpportunityContact(opportunityContact);
        }

        return opportunityContact;
    }

}
