package com.learning.spring.boot.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

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
    /**
     * 线程池对拒绝任务（无线程可用）的处理策略，目前只支持四种：
     *  1、ThreadPoolExecutor.AbortPolicy策略，是默认的策略,处理程序遭到拒绝将抛出运行时 RejectedExecutionException
     *  2、ThreadPoolExecutor.CallerRunsPolicy策略 ,调用者的线程会执行该任务,如果执行器已关闭,则丢弃
     *  3、ThreadPoolExecutor.DiscardPolicy策略，不能执行的任务将被丢弃
     *  4、ThreadPoolExecutor.DiscardOldestPolicy策略，如果执行程序尚未关闭，则位于工作队列头部的任务将被删除，然后重试执行程序（如果再次失败，则重复此过程）
     */
    taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    //调度器shutdown被调用时等待当前被调度的任务完成
    taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
    //等待时长
    taskExecutor.setAwaitTerminationSeconds(60);
    taskExecutor.initialize();
    return taskExecutor;
  }

}
