package ru.geekbrains.hw7d.controllers.reprs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.OpportunityProduct;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRepr {

    private Long id;

    private String productName;

    private OpportunityProduct opportunityProduct;

}
