package ru.geekbrains.hw7d.patterns.datamapper;

import ru.geekbrains.hw7d.models.Account;

import java.util.Optional;

public interface DataMapperAccount {

    Optional<Account> find(Long accountId);

    void insert(Account account) throws DataMapperException;

    void update(Account account) throws DataMapperException;

    void delete(Account account) throws DataMapperException;

}
