package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Opportunities;

public class DatabaseOpportunities {

    private IdentityMapOpportunities identityMapOpportunities;

    public DatabaseOpportunities() {
    }

    public DatabaseOpportunities(IdentityMapOpportunities identityMapOpportunities) {
        this.identityMapOpportunities = identityMapOpportunities;
    }

    public IdentityMapOpportunities getIdentityMapOpportunities() {
        return identityMapOpportunities;
    }

    public void setIdentityMapOpportunities(IdentityMapOpportunities identityMapOpportunities) {
        this.identityMapOpportunities = identityMapOpportunities;
    }

    public Opportunities finder(Long key) {
        Opportunities opportunity = identityMapOpportunities.getOpportunity(key);

        if (opportunity == null) {
            // Get opportunity from database
            identityMapOpportunities.addOpportunity(opportunity);
        }

        return opportunity;
    }

}
