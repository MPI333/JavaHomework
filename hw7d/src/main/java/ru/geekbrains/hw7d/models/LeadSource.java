package ru.geekbrains.hw7d.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "leadsources")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "source_name", length = 128, nullable = false)
    private String sourceName;

    @OneToOne(mappedBy = "leadsource")
    private Leads lead;

}
