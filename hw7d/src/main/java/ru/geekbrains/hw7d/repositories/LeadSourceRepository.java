package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.LeadSource;

public interface LeadSourceRepository extends JpaRepository<LeadSource, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM LeadSource ls WHERE ls.id = :id")
    void deleteLeadSourceById(@Param("id") Long id);

}
