package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "opportunitycontacts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpportunityContacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(optional = false)
    private Opportunities opportunity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "opportunitycontactrole_id", referencedColumnName = "id")
    private OpportunityContactRoles opportunityContactRole;

}
