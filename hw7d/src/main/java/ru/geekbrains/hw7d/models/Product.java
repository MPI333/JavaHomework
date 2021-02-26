package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name", length = 128, nullable = false)
    private String productName;

    @OneToOne(mappedBy = "product")
    private OpportunityProduct opportunityProduct;

    public Product() {
    }

    public Product(String productName, OpportunityProduct opportunityProduct) {
        this.productName = productName;
        this.opportunityProduct = opportunityProduct;
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

}
