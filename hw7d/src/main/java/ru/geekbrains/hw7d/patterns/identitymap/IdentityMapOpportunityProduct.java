package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.OpportunityProduct;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapOpportunityProduct {

    private Map opportunityProductMap = new HashMap();

    public IdentityMapOpportunityProduct() {
    }

    public void addOpportunityProduct(OpportunityProduct opportunityProduct) {
        opportunityProductMap.put(opportunityProduct.getId(), opportunityProduct);
    }

    public OpportunityProduct getOpportunityProduct(Long key) {
        return (OpportunityProduct)opportunityProductMap.get(key);
    }

}
