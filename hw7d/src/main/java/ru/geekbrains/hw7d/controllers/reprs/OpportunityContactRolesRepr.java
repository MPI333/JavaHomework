package ru.geekbrains.hw7d.controllers.reprs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.OpportunityContacts;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpportunityContactRolesRepr {

    private Long id;

    private String roleName;

    private OpportunityContacts opportunityContact;

}
