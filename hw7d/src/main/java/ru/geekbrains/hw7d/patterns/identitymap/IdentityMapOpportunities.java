package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Opportunities;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapOpportunities {

    private Map opportunityMap = new HashMap();

    public IdentityMapOpportunities() {
    }

    public void addOpportunity(Opportunities opportunity) {
        opportunityMap.put(opportunity.getId(), opportunity);
    }

    public Opportunities getOpportunity(Long key) {
        return (Opportunities)opportunityMap.get(key);
    }

}
