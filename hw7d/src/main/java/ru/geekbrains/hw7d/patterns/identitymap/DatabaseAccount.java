package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Account;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseAccount {

    private IdentityMapAccount identityMapAccount;

    public Account finder(Long key) {
        Account account = identityMapAccount.getAccount(key);

        if (account == null) {
            // Get account from database
            identityMapAccount.addAccount(account);
        }

        return account;
    }

}
