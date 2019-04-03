package com.learning.spring.boot.controller.system;

import com.learning.spring.boot.constant.ViewConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Package: com.learning.spring.boot.controller.system
 * @ClassName: UserController
 * @Author: beibei.huang
 * @Description: 系统用户设置
 * @Date: 2019/4/3 11:07
 */
@RestController
@RequestMapping("/system/user")
@Api(tags = "公共功能操作API")
public class UserController {

    @ApiOperation("跳转至系统用户设置页面")
    @GetMapping("")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName(ViewConstant.SYSTEM_USER);
        return mv;
    }




}
