package com.lloyvet.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserWebApplication.class, args);
    }

}
