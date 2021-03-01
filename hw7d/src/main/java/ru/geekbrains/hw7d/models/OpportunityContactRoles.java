package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "opportunitycontactroles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpportunityContactRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_name", length = 32, nullable = false)
    private String roleName;

    @OneToOne(mappedBy = "opportunitycontactrole")
    private OpportunityContacts opportunityContact;

}
