package cc.mrbird.job.task;

import cc.mrbird.common.annotation.CronTag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CronTag("testTask")
public class TestTask {

    public void test(String params) {
        log.info("我是带参数的test方法，正在被执行，参数为：{}" , params);
    }

    public void test1() {
        log.info("我是不带参数的test1方法，正在被执行");
    }

}
