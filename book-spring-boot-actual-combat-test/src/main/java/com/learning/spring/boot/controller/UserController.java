package com.learning.spring.boot.controller;

import com.learning.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: UserController
 * @Author: beibei.huang
 * @Description: 用户操作控制器
 * @Date: 2019/1/21 10:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



}
