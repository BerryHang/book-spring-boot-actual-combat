package com.learning.spring.boot.Configuration;

import java.util.concurrent.ThreadPoolExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Package: com.learning.spring.boot.Configuration
 * @ClassName: ScheduleConfiguration
 * @Author: beibei.huang
 * @Description: 定时任务线程池配置
 * @Date: 2019/4/25 14:50
 */
@Configuration
@EnableAsync
public class ScheduleConfiguration {

  @Bean(name = "scheduledPoolTaskExecutor")
  public ThreadPoolTaskExecutor getAsyncThreadPoolTaskExecutor() {
    ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
    taskExecutor.setCorePoolSize(20);
    taskExecutor.setMaxPoolSize(200);
    taskExecutor.setQueueCapacity(25);
    taskExecutor.setKeepAliveSeconds(200);
    taskExecutor.setThreadNamePrefix("Scheduled-Pool");
    // 线程池对拒绝任务（无线程可用）的处理策略，目前只支持AbortPolicy、CallerRunsPolicy；默认为后者
    taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    //调度器shutdown被调用时等待当前被调度的任务完成
    taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
    //等待时长
    taskExecutor.setAwaitTerminationSeconds(60);
    taskExecutor.initialize();
    return taskExecutor;
  }

}
