package com.learning.spring.boot.service;

import com.learning.spring.boot.BookSpringBootActualCombatTestApplication;
import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import junit.framework.TestCase;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: UserServiceTest
 * @Author: beibei.huang
 * @Description: 用户service测试类
 * @Date: 2019/6/20 8:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { BookSpringBootActualCombatTestApplication.class, UserService.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @BeforeClass
    public static void init(){
        System.out.println("类测试开始");
    }

    @Before
    public void initUserListSize(){
        System.out.println("方法测试开始" );
    }

    @Test
    public void findUserTest(){
        UserEntity user = userService.findUser(1);
        System.out.println(user.toString());
        TestCase.assertEquals("李磊",user.getUserName());
    }

    @Test(timeout = 1000)
    public void createUserTest(){
        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setPassword("123");
        userCreateRequest.setUserName("Berry");
        userCreateRequest.setAge(16);
        Integer userId = userService.createUser(userCreateRequest);
        UserEntity user = userService.findUser(userId);
        System.out.println(user.toString());
        TestCase.assertEquals("Berry",user.getUserName());
    }

    @After
    public void userListTest(){
        System.out.println("方法测试结束");
    }

    @AfterClass
    public static void close(){
        System.out.println("类测试结束");
    }

}
