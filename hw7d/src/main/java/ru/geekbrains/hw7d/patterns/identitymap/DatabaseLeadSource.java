package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.LeadSource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseLeadSource {

    private IdentityMapLeadSource identityMapLeadSource;

    public LeadSource finder(Long key) {
        LeadSource leadSource = identityMapLeadSource.getLeadSource(key);

        if (leadSource == null) {
            // Get leadSource from database
            identityMapLeadSource.addLeadSource(leadSource);
        }

        return leadSource;
    }

}
