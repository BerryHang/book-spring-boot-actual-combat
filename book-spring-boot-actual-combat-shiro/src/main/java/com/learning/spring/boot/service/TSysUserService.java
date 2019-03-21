package com.learning.spring.boot.service;

import com.learning.spring.boot.domain.entity.TSysUser;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: TSysUserService
 * @Author: beibei.huang
 * @Description: 用户相关业务接口
 * @Date: 2019/3/20 11:37
 */
public interface TSysUserService {

    TSysUser findUser(Integer userId);



}
