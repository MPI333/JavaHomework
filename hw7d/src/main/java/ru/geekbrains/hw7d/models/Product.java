package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name", length = 128, nullable = false)
    private String productName;

    @OneToOne(mappedBy = "product")
    private OpportunityProduct opportunityProduct;

}
