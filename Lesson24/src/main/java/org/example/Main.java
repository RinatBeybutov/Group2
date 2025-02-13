package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        JdbcTemplate bean = context.getBean(JdbcTemplate.class);
        Integer count = bean.queryForObject("SELECT count(*) FROM users", Integer.class);

        NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

        var result = namedParameterJdbcTemplate.queryForObject("SELECT * FROM users where id = :id",
                Map.of("id", "1"),
                getUserRowMapper());

        System.out.println();
    }

    private static RowMapper<User> getUserRowMapper() {
        return (rs, _) -> {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            return new User(id, name, email);
        };
    }
}