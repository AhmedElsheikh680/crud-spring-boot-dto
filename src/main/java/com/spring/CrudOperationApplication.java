package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class CrudOperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudOperationApplication.class, args);
    }

}
