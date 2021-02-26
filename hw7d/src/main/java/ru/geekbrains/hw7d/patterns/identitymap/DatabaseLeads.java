package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Leads;

public class DatabaseLeads {

    private IdentityMapLeads identityMapLeads;

    public DatabaseLeads() {
    }

    public DatabaseLeads(IdentityMapLeads identityMapLeads) {
        this.identityMapLeads = identityMapLeads;
    }

    public IdentityMapLeads getIdentityMapLeads() {
        return identityMapLeads;
    }

    public void setIdentityMapLeads(IdentityMapLeads identityMapLeads) {
        this.identityMapLeads = identityMapLeads;
    }

    public Leads finder(Long key) {
        Leads lead = identityMapLeads.getLead(key);

        if (lead == null) {
            // Get lead from database
            identityMapLeads.addLead(lead);
        }

        return lead;
    }

}
