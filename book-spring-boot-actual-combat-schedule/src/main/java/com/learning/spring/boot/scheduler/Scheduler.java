package com.learning.spring.boot.scheduler;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Package: com.learning.spring.boot.scheduler
 * @ClassName: Scheduler
 * @Author: beibei.huang
 * @Description: 定时任务
 * @Date: 2019/4/25 14:08
 */
@Component
@Slf4j
public class Scheduler {

  @Async("scheduledPoolTaskExecutor")
  @Scheduled(cron = "0/3 * * * * *")
  public void SchedulerUseCron() {
    log.info("使用 Cron 配置定时任务执行规则，执行时间：{}" + LocalDateTime.now());
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Async("scheduledPoolTaskExecutor")
  @Scheduled(fixedDelay = 1000 * 3)
  public void SchedulerUseFixedDelay() {
    log.info("使用 fixedDelay 配置定时任务执行规则，执行时间：{}" + LocalDateTime.now());
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Async("scheduledPoolTaskExecutor")
  @Scheduled(fixedRate = 1000 * 3)
  public void SchedulerUseFixedRate() {
    log.info("使用 fixedRate 配置定时任务执行规则，执行时间：{}" + LocalDateTime.now());
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
