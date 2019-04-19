package com.learning.spring.boot.controller.system;

import com.learning.spring.boot.constant.ViewConstant;
import com.learning.spring.boot.domain.entity.TSysUser;
import com.learning.spring.boot.domain.request.UserBean;
import com.learning.spring.boot.service.TSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @Autowired
    private TSysUserService tSysUserService;

    @ApiOperation("跳转至系统用户设置页面")
    @GetMapping("/list")
    public ModelAndView login(UserBean userBean) {
        ModelAndView mv = new ModelAndView();
        List<TSysUser> userList = tSysUserService.findUserPage(userBean);
        mv.addObject("user", userList);
        mv.addObject("userBean", userBean);
        mv.setViewName(ViewConstant.SYSTEM_USER);
        return mv;
    }




}
