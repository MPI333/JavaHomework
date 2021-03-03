package ru.geekbrains.hw7d.DAO;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.patterns.datamapper.AccountDataMapper;

import java.util.List;

@RequiredArgsConstructor
public class AccountDAO {

    private final JdbcTemplate jdbcTemplate;
    private final AccountDataMapper accountDataMapper;
    private final ResultSetExtractor<List<Account>> resultSetExtractor;

    public List<Account> findAllUsingRowMapper() {
        return jdbcTemplate.query("SELECT * FROM Account", accountDataMapper);
    }

    public List<Account> findAllUsingExtractor() {
        return jdbcTemplate.query("SELECT * FROM Account", resultSetExtractor);
    }

}
