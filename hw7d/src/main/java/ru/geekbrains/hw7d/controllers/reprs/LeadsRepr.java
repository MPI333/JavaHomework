package ru.geekbrains.hw7d.controllers.reprs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.models.LeadSource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadsRepr {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String address;

    private Contacts contact;

    private LeadSource leadSource;

}
