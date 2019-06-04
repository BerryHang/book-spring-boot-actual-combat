package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@EnableWebSocket
@SpringBootApplication
public class BookSpringBootActualCombatWebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSpringBootActualCombatWebSocketApplication.class, args);
    }
}
