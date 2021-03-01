package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contacts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {

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

    @Column(name = "website", length = 128, nullable = false)
    private String website;

    @Column(name = "address", length = 128, nullable = false)
    private String address;

    @Column(name = "description")
    private String description;

    @ManyToOne(optional = false)
    private Account account;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<Opportunities> opportunitiesList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    private Leads lead;

}
