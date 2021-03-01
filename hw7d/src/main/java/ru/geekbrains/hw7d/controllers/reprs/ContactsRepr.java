package ru.geekbrains.hw7d.controllers.reprs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.models.Leads;
import ru.geekbrains.hw7d.models.Opportunities;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsRepr {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String website;

    private String address;

    private String description;

    private Account account;

    private List<Opportunities> opportunitiesList;

    private Leads lead;

}
