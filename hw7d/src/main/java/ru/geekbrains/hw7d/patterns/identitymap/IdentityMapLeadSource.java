package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.LeadSource;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapLeadSource {

    private Map leadSourceMap = new HashMap();

    public IdentityMapLeadSource() {
    }

    public void addLeadSource(LeadSource leadSource) {
        leadSourceMap.put(leadSource.getId(), leadSource);
    }

    public LeadSource getLeadSource(Long key) {
        return (LeadSource)leadSourceMap.get(key);
    }

}
