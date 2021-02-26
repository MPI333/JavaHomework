package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Contacts c WHERE c.id = :id")
    void deleteContactById(@Param("id") Long id);

}
