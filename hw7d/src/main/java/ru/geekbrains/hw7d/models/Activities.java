package ru.geekbrains.hw7d.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "activities")
@Data
@NoArgsConstructor
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "type", length = 32, nullable = false)
    private String type;

    @ManyToOne(optional = false)
    private Account account;

}
