package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Account;

public class DatabaseAccount {

    private IdentityMapAccount identityMapAccount;

    public DatabaseAccount() {
    }

    public DatabaseAccount(IdentityMapAccount identityMapAccount) {
        this.identityMapAccount = identityMapAccount;
    }

    public IdentityMapAccount getIdentityMapAccount() {
        return identityMapAccount;
    }

    public void setIdentityMapAccount(IdentityMapAccount identityMapAccount) {
        this.identityMapAccount = identityMapAccount;
    }

    public Account finder(Long key) {
        Account account = identityMapAccount.getAccount(key);

        if (account == null) {
            // Get account from database
            identityMapAccount.addAccount(account);
        }

        return account;
    }

}
