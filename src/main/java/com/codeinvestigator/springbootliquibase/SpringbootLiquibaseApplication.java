package com.codeinvestigator.springbootliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringbootLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLiquibaseApplication.class, args);
    }

}
