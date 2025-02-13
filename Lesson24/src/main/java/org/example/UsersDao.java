package org.example;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Map;

public class UsersDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public User getUser() {
        return namedParameterJdbcTemplate.queryForObject("SELECT * FROM users where id = :id",
                Map.of("id", "1"),
                getUserRowMapper());
    }

    private RowMapper<User> getUserRowMapper() {
        return (rs, _) -> {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            return new User(id, name, email);
        };
    }
}
