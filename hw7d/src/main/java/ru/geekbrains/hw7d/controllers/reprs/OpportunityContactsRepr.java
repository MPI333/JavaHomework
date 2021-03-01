package ru.geekbrains.hw7d.controllers.reprs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.models.OpportunityContactRoles;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpportunityContactsRepr {

    private Long id;

    private Opportunities opportunity;

    private OpportunityContactRoles opportunityContactRole;

}
