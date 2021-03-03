package ru.geekbrains.hw7d.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "opportunities")
@Data
@NoArgsConstructor
public class Opportunities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @Column(name = "source", length = 128, nullable = false)
    private String source;

    @Column(name = "status", length = 32, nullable = false)
    private String status;

    @ManyToOne(optional = false)
    private Contacts contact;

    @OneToMany(mappedBy = "opportunity", cascade = CascadeType.ALL)
    private List<OpportunityContacts> opportunityContactsList;

    @OneToMany(mappedBy = "opportunity", cascade = CascadeType.ALL)
    private List<OpportunityProduct> opportunityProductList;

}
