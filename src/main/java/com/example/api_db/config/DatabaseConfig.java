package com.example.api_db.config;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUser("dbadmin");
        dataSource.setPassword("Nibelunghi1");
        dataSource.setUrl("jdbc:mariadb://192.168.188.65:3306/springbootdb");
        return dataSource;
    }
}

