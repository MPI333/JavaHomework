package ru.geekbrains.hw7d.services;

import ru.geekbrains.hw7d.controllers.reprs.AccountRepr;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<AccountRepr> findAll();

    Optional<AccountRepr> findById(Long id);

    void save(AccountRepr accountRepr);

    void delete(Long id);

}
