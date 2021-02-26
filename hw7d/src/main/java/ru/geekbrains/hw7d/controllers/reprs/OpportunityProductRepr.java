package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.models.OpportunityProduct;
import ru.geekbrains.hw7d.models.Product;

import java.util.Objects;

public class OpportunityProductRepr {

    private Long id;

    private String date;

    private Long quantity;

    private String description;

    private Opportunities opportunity;

    private Product product;

    public OpportunityProductRepr() {
    }

    public OpportunityProductRepr(OpportunityProduct opportunityProduct) {
        this.id = opportunityProduct.getId();
        this.date = opportunityProduct.getDate();
        this.quantity = opportunityProduct.getQuantity();
        this.description = opportunityProduct.getDescription();
        this.opportunity = opportunityProduct.getOpportunity();
        this.product = opportunityProduct.getProduct();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Opportunities getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunities opportunity) {
        this.opportunity = opportunity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpportunityProductRepr that = (OpportunityProductRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
