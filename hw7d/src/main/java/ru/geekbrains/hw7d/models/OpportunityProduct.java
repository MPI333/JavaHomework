package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "opportunityproducts")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
