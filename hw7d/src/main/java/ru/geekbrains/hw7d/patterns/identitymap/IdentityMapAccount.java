package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Account;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapAccount {

    private Map accountMap = new HashMap();

    public IdentityMapAccount() {
    }

    public void addAccount(Account account) {
        accountMap.put(account.getId(), account);
    }

    public Account getAccount(Long key) {
        return (Account)accountMap.get(key);
    }

}
