package ru.geekbrains.hw7d.controllers.reprs;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Activities;
import ru.geekbrains.hw7d.models.Contacts;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class AccountRepr {

    private Long id;

    private String name;

    private String password;

    private BigDecimal balance;

    private String phone;

    private String email;

    private String website;

    private String address;

    private String description;

    private List<Contacts> contactsList;

    private List<Activities> activitiesList;

}
