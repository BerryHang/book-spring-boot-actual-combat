package com.learning.spring.boot.service;

import com.learning.spring.boot.BookSpringBootActualCombatTestApplication;
import com.learning.spring.boot.domain.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: UserServiceTest
 * @Author: beibei.huang
 * @Description: 用户service测试类
 * @Date: 2019/6/20 8:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { BookSpringBootActualCombatTestApplication.class, UserService.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserListTest(){
        List<UserEntity> userList = userService.findUserList();
        System.out.println(userList.toString());
    }






}
