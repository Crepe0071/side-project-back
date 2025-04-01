package com.side.infrastructure.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class DataSourceConfig {

    @Bean
    public HikariDataSource dataSource() {

        HikariDataSource hikariDataSource = new HikariDataSource();

        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Seoul");
        hikariDataSource.setUsername("test_id");
        hikariDataSource.setPassword("test_pw");
        hikariDataSource.setMaximumPoolSize(100);
        hikariDataSource.setMinimumIdle(1);
        hikariDataSource.setConnectionTestQuery("SELECT 1");
        hikariDataSource.setConnectionInitSql("SELECT 1");
        hikariDataSource.setAutoCommit(true);
        hikariDataSource.setIsolateInternalQueries(true);
        hikariDataSource.setTransactionIsolation("TRANSACTION_REPEATABLE_READ");
        hikariDataSource.setConnectionTimeout(30000);
        hikariDataSource.setIdleTimeout(30000);
        hikariDataSource.setMaxLifetime(1800000); // 30분
        hikariDataSource.setLeakDetectionThreshold(2000); // 2초
        hikariDataSource.setPoolName("SideProjectHikariCP");

        return hikariDataSource;
    }
}
