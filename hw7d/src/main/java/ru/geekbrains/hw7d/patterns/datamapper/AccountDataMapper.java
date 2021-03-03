package ru.geekbrains.hw7d.patterns.datamapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.geekbrains.hw7d.models.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AccountDataMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getLong("id"));
        account.setName(rs.getString("name"));
        account.setPassword(rs.getString("password"));
        account.setBalance(rs.getBigDecimal("balance"));
        account.setPhone(rs.getString("phone"));
        account.setEmail(rs.getString("email"));
        account.setWebsite(rs.getString("website"));
        account.setAddress(rs.getString("address"));
        account.setDescription(rs.getString("description"));
        return account;
    }

}
