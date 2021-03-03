package ru.geekbrains.hw7d.controllers.reprs;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.models.OpportunityContacts;
import ru.geekbrains.hw7d.models.OpportunityProduct;

import java.util.List;

@Data
@NoArgsConstructor
public class OpportunitiesRepr {

    private Long id;

    private String name;

    private String source;

    private String status;

    private Contacts contact;

    private List<OpportunityContacts> opportunityContactsList;

    private List<OpportunityProduct> opportunityProductList;

}
