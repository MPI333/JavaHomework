package ru.geekbrains.hw7d.controllers.reprs;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Account;

@Data
@NoArgsConstructor
public class ActivitiesRepr {

    private Long id;

    private String name;

    private String type;

    private Account account;

}
