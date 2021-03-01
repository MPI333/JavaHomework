package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseProduct {

    private IdentityMapProduct identityMapProduct;

    public Product finder(Long key) {
        Product product = identityMapProduct.getProduct(key);

        if (product == null) {
            // Get product from database
            identityMapProduct.addProduct(product);
        }

        return product;
    }

}
