package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.Activities;

public interface ActivitiesRepository extends JpaRepository<Activities, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Activities a WHERE a.id = :id")
    void deleteActivityById(@Param("id") Long id);

}
