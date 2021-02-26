package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.LeadSource;
import ru.geekbrains.hw7d.models.Leads;

import java.util.Objects;

public class LeadSourceRepr {

    private Long id;

    private String sourceName;

    private Leads lead;

    public LeadSourceRepr() {
    }

    public LeadSourceRepr(LeadSource leadSource) {
        this.id = leadSource.getId();
        this.sourceName = leadSource.getSourceName();
        this.lead = leadSource.getLead();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeadSourceRepr that = (LeadSourceRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
