package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Leads l WHERE l.id = :id")
    void deleteLeadById(@Param("id") Long id);

}
