package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.OpportunityContacts;

public interface OpportunityContactsRepository extends JpaRepository<OpportunityContacts, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM OpportunityContacts oc WHERE oc.id = :id")
    void deleteOpportunityContactById(@Param("id") Long id);

}
