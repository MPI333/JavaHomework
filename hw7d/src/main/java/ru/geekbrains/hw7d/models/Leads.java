package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "leads")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 128, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 128, nullable = false)
    private String lastName;

    @Column(name = "phone", length = 32, nullable = false)
    private String phone;

    @Column(name = "email", length = 32, nullable = false)
    private String email;

    @Column(name = "address", length = 128, nullable = false)
    private String address;

    @OneToOne(mappedBy = "lead")
    private Contacts contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "leadsource_id", referencedColumnName = "id")
    private LeadSource leadSource;

}
