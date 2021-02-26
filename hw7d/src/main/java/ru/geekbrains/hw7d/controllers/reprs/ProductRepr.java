package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.OpportunityProduct;
import ru.geekbrains.hw7d.models.Product;

import java.util.Objects;

public class ProductRepr {

    private Long id;

    private String productName;

    private OpportunityProduct opportunityProduct;

    public ProductRepr() {
    }

    public ProductRepr(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.opportunityProduct = product.getOpportunityProduct();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OpportunityProduct getOpportunityProduct() {
        return opportunityProduct;
    }

    public void setOpportunityProduct(OpportunityProduct opportunityProduct) {
        this.opportunityProduct = opportunityProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepr that = (ProductRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
