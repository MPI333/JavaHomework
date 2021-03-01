package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Leads;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseLeads {

    private IdentityMapLeads identityMapLeads;

    public Leads finder(Long key) {
        Leads lead = identityMapLeads.getLead(key);

        if (lead == null) {
            // Get lead from database
            identityMapLeads.addLead(lead);
        }

        return lead;
    }

}
