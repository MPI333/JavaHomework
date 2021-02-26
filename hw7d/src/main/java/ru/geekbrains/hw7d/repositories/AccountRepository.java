package ru.geekbrains.hw7d.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Account a WHERE a.id = :id")
    void deleteAccountById(@Param("id") Long id);

}
