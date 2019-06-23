package com.learning.spring.boot.service;

import com.learning.spring.boot.BookSpringBootActualCombatTestApplication;
import com.learning.spring.boot.domain.entity.UserEntity;
import junit.framework.TestCase;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: UserServiceContiPerfRule
 * @Author: beibei.huang
 * @Description: 用户方法性能测试
 * @Date: 2019/6/23 10:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { BookSpringBootActualCombatTestApplication.class, UserService.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceContiPerfRule {

    @Autowired
    private UserService userService;

    @Rule
    public ContiPerfRule contiPerfRule = new ContiPerfRule();

    @Test
    @PerfTest(invocations = 1000,threads = 5)
    public void findUserTest(){
        UserEntity user = userService.findUser(1);
        System.out.println(user.toString());
        TestCase.assertEquals("李磊",user.getUserName());
    }

}
