package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "opportunityproducts")
public class OpportunityProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date", length = 128, nullable = false)
    private String date;

    @Column(name = "quantity", length = 32)
    private Long quantity;

    @Column(name = "description")
    private String description;

    @ManyToOne(optional = false)
    private Opportunities opportunity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public OpportunityProduct() {
    }

    public OpportunityProduct(String date, Long quantity, String description,
                              Opportunities opportunity, Product product) {
        this.date = date;
        this.quantity = quantity;
        this.description = description;
        this.opportunity = opportunity;
        this.product = product;
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

}
