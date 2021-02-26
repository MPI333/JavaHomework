package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "leadsources")
public class LeadSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "source_name", length = 128, nullable = false)
    private String sourceName;

    @OneToOne(mappedBy = "leadsource")
    private Leads lead;

    public LeadSource() {
    }

    public LeadSource(String sourceName, Leads lead) {
        this.sourceName = sourceName;
        this.lead = lead;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Leads getLead() {
        return lead;
    }

    public void setLead(Leads lead) {
        this.lead = lead;
    }

}
