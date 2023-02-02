package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) { //SpringBoot will run ALL CommandLineRunner when loaded

        return args -> {
            log.info("Preloading "+ repository.save(new Employee("Minh", "burglar")));
            log.info("Preloading "+ repository.save(new Employee("Quan","thief")));
        };
    }
}
