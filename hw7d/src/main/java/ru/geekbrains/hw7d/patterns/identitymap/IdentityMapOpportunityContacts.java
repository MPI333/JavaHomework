package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityContacts;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapOpportunityContacts {

    private Map opportunityContactsMap = new HashMap();

    public IdentityMapOpportunityContacts() {
    }

    public void addOpportunityContact(OpportunityContacts opportunityContact) {
        opportunityContactsMap.put(opportunityContact.getId(), opportunityContact);
    }

    public OpportunityContacts getOpportunityContact(Long key) {
        return (OpportunityContacts)opportunityContactsMap.get(key);
    }

}
