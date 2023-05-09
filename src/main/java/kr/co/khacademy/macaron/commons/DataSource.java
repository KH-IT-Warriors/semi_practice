package kr.co.khacademy.macaron.commons;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.SQLException;

@UtilityClass
public class DataSource {
    private final HikariConfig hikariConfig = new HikariConfig("/datasource.properties");
    private final HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);

    public Connection getInstance() throws SQLException {
        return hikariDataSource.getConnection();
    }
}
