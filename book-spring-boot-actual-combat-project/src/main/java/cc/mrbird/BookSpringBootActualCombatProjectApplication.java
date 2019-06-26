package cc.mrbird;

import cc.mrbird.common.config.FebsProperties;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cc.mrbird.*.dao")
@EnableConfigurationProperties({FebsProperties.class})
@EnableCaching
@EnableAsync
@Slf4j
public class BookSpringBootActualCombatProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSpringBootActualCombatProjectApplication.class, args);
        log.info("《《《《《《 book-spring-boot-actual-combat-project started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
    }
}
