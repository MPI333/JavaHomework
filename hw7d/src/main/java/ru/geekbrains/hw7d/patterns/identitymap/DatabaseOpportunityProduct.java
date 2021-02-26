package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityProduct;

public class DatabaseOpportunityProduct {

    private IdentityMapOpportunityProduct identityMapOpportunityProduct;

    public DatabaseOpportunityProduct() {
    }

    public DatabaseOpportunityProduct(IdentityMapOpportunityProduct identityMapOpportunityProduct) {
        this.identityMapOpportunityProduct = identityMapOpportunityProduct;
    }

    public IdentityMapOpportunityProduct getIdentityMapOpportunityProduct() {
        return identityMapOpportunityProduct;
    }

    public void setIdentityMapOpportunityProduct(IdentityMapOpportunityProduct identityMapOpportunityProduct) {
        this.identityMapOpportunityProduct = identityMapOpportunityProduct;
    }

    public OpportunityProduct finder(Long key) {
        OpportunityProduct opportunityProduct = identityMapOpportunityProduct.getOpportunityProduct(key);

        if (opportunityProduct == null) {
            // Get opportunityProduct from database
            identityMapOpportunityProduct.addOpportunityProduct(opportunityProduct);
        }

        return opportunityProduct;
    }

}
