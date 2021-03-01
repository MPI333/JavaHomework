package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "password", length = 128, nullable = false)
    private String password;

    @Column(name = "balance")
    private BigDecimal balance;

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

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Contacts> contactsList;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Activities> activitiesList;

}
