package ru.geekbrains.hw7d.controllers.reprs;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Leads;

@Data
@NoArgsConstructor
public class LeadSourceRepr {

    private Long id;

    private String sourceName;

    private Leads lead;

}
