package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BookSpringBootActualCombatSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSpringBootActualCombatSchedulerApplication.class, args);
    }
}
