package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.OpportunityProduct;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseOpportunityProduct {

    private IdentityMapOpportunityProduct identityMapOpportunityProduct;

    public OpportunityProduct finder(Long key) {
        OpportunityProduct opportunityProduct = identityMapOpportunityProduct.getOpportunityProduct(key);

        if (opportunityProduct == null) {
            // Get opportunityProduct from database
            identityMapOpportunityProduct.addOpportunityProduct(opportunityProduct);
        }

        return opportunityProduct;
    }

}
