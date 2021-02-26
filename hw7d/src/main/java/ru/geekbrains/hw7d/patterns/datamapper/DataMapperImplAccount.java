package ru.geekbrains.hw7d.patterns.datamapper;

import ru.geekbrains.hw7d.models.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataMapperImplAccount implements DataMapperAccount {

    // Data from database
    private List<Account> accounts = new ArrayList<>();

    public DataMapperImplAccount() {
    }

    public DataMapperImplAccount(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    @Override
    public Optional<Account> find(Long accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                return Optional.of(account);
            }
        }

        return Optional.empty();
    }

    @Override
    public void insert(Account account) throws DataMapperException {
        if(!accounts.contains(account)) {
            accounts.add(account);
        } else {
            throw new DataMapperException("Account [" + account.getName() + "] already exists!");
        }
    }

    @Override
    public void update(Account account) throws DataMapperException {
        if(accounts.contains(account)) {
            final int index = accounts.indexOf(account);
            accounts.set(index, account);
        } else {
            throw new DataMapperException("Account [" + account.getName() + "] not found!");
        }
    }

    @Override
    public void delete(Account account) throws DataMapperException {
        if (this.getAccounts().contains(account)) {
            this.getAccounts().remove(account);
        } else {
            throw new DataMapperException("Account [" + account.getName() + "] not found!");
        }
    }

}
