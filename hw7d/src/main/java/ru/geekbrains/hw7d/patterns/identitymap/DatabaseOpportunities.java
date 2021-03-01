package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Opportunities;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseOpportunities {

    private IdentityMapOpportunities identityMapOpportunities;

    public Opportunities finder(Long key) {
        Opportunities opportunity = identityMapOpportunities.getOpportunity(key);

        if (opportunity == null) {
            // Get opportunity from database
            identityMapOpportunities.addOpportunity(opportunity);
        }

        return opportunity;
    }

}
