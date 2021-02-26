package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Product;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapProduct {

    private Map productMap = new HashMap();

    public IdentityMapProduct() {
    }

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product getProduct(Long key) {
        return (Product)productMap.get(key);
    }

}
