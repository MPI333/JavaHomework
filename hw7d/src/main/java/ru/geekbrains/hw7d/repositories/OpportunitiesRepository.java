package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.Opportunities;

public interface OpportunitiesRepository extends JpaRepository<Opportunities, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Opportunities o WHERE o.id = :id")
    void deleteOpportunityById(@Param("id") Long id);

}
