package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.OpportunityProduct;

public interface OpportunityProductRepository extends JpaRepository<OpportunityProduct, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM OpportunityProduct op WHERE op.id = :id")
    void deleteOpportunityProductById(@Param("id") Long id);

}
