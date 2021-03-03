package ru.geekbrains.hw7d.controllers.reprs;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.models.Product;

@Data
@NoArgsConstructor
public class OpportunityProductRepr {

    private Long id;

    private String date;

    private Long quantity;

    private String description;

    private Opportunities opportunity;

    private Product product;

}
