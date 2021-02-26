package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.LeadSource;

public class DatabaseLeadSource {

    private IdentityMapLeadSource identityMapLeadSource;

    public DatabaseLeadSource() {
    }

    public DatabaseLeadSource(IdentityMapLeadSource identityMapLeadSource) {
        this.identityMapLeadSource = identityMapLeadSource;
    }

    public IdentityMapLeadSource getIdentityMapLeadSource() {
        return identityMapLeadSource;
    }

    public void setIdentityMapLeadSource(IdentityMapLeadSource identityMapLeadSource) {
        this.identityMapLeadSource = identityMapLeadSource;
    }

    public LeadSource finder(Long key) {
        LeadSource leadSource = identityMapLeadSource.getLeadSource(key);

        if (leadSource == null) {
            // Get leadSource from database
            identityMapLeadSource.addLeadSource(leadSource);
        }

        return leadSource;
    }

}
