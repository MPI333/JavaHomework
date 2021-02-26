package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.models.OpportunityContacts;
import ru.geekbrains.hw7d.models.OpportunityProduct;

import java.util.List;
import java.util.Objects;

public class OpportunitiesRepr {

    private Long id;

    private String name;

    private String source;

    private String status;

    private Contacts contact;

    private List<OpportunityContacts> opportunityContactsList;

    private List<OpportunityProduct> opportunityProductList;

    public OpportunitiesRepr() {
    }

    public OpportunitiesRepr(Opportunities opportunity) {
        this.id = opportunity.getId();
        this.name = opportunity.getName();
        this.source = opportunity.getSource();
        this.status = opportunity.getStatus();
        this.contact = opportunity.getContact();
        this.opportunityContactsList = opportunity.getOpportunityContactsList();
        this.opportunityProductList = opportunity.getOpportunityProductList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public List<OpportunityContacts> getOpportunityContactsList() {
        return opportunityContactsList;
    }

    public void setOpportunityContactsList(List<OpportunityContacts> opportunityContactsList) {
        this.opportunityContactsList = opportunityContactsList;
    }

    public List<OpportunityProduct> getOpportunityProductList() {
        return opportunityProductList;
    }

    public void setOpportunityProductList(List<OpportunityProduct> opportunityProductList) {
        this.opportunityProductList = opportunityProductList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpportunitiesRepr that = (OpportunitiesRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
