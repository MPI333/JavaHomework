package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.OpportunityContactRoles;

public interface OpportunityContactRolesRepository extends JpaRepository<OpportunityContactRoles, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM OpportunityContactRoles ocr WHERE ocr.id = :id")
    void deleteOpportunityContactRoleById(@Param("id") Long id);

}
