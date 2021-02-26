package ru.geekbrains.hw7d.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.controllers.reprs.AccountRepr;
import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.repositories.AccountRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountRepr> findAll() {
        return accountRepository.findAll().stream().map(AccountRepr::new).collect(Collectors.toList());
    }

    @Override
    public Optional<AccountRepr> findById(Long id) {
        return accountRepository.findById(id).map(AccountRepr::new);
    }

    @Override
    public void save(AccountRepr accountRepr) {
        Account account = new Account();
        account.setId(accountRepr.getId());
        account.setName(accountRepr.getName());
        account.setPassword(accountRepr.getPassword());
        account.setBalance(accountRepr.getBalance());
        account.setPhone(accountRepr.getPhone());
        account.setEmail(accountRepr.getEmail());
        account.setWebsite(accountRepr.getWebsite());
        account.setAddress(accountRepr.getAddress());
        account.setDescription(accountRepr.getDescription());
        account.setContactsList(accountRepr.getContactsList());
        account.setActivitiesList(accountRepr.getActivitiesList());
        accountRepository.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteAccountById(id);
    }

}
