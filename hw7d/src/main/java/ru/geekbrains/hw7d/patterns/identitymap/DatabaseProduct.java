package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Product;

public class DatabaseProduct {

    private IdentityMapProduct identityMapProduct;

    public DatabaseProduct() {
    }

    public DatabaseProduct(IdentityMapProduct identityMapProduct) {
        this.identityMapProduct = identityMapProduct;
    }

    public IdentityMapProduct getIdentityMapProduct() {
        return identityMapProduct;
    }

    public void setIdentityMapProduct(IdentityMapProduct identityMapProduct) {
        this.identityMapProduct = identityMapProduct;
    }

    public Product finder(Long key) {
        Product product = identityMapProduct.getProduct(key);

        if (product == null) {
            // Get product from database
            identityMapProduct.addProduct(product);
        }

        return product;
    }

}
