package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Leads;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapLeads {

    private Map leadMap = new HashMap();

    public IdentityMapLeads() {
    }

    public void addLead(Leads lead) {
        leadMap.put(lead.getId(), lead);
    }

    public Leads getLead(Long key) {
        return (Leads)leadMap.get(key);
    }

}
