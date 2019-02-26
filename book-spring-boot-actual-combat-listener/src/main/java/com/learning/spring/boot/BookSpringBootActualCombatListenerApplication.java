package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class BookSpringBootActualCombatListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSpringBootActualCombatListenerApplication.class, args);
    }
}
