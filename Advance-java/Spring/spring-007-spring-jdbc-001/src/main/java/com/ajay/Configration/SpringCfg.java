package com.ajay.Configration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.ajay"})
public class SpringCfg {

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;

    }

    private DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource =
                new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring",
                        "root",
                        "root");
        return driverManagerDataSource;
    }

    ;


}
