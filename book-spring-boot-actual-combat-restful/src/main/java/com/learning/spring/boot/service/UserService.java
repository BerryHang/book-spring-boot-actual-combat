package com.learning.spring.boot.service;

import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: UserService
 * @Author: beibei.huang
 * @Description: 用户业务操作接口
 * @Date: 2019/1/21 11:08
 */
public interface UserService {

    /**
     * 查询用户列表
     * @return
     */
    List<UserEntity> findUserList();

    /**
     * 根据用户ID获取用户信息
     * @param userId
     * @return
     */
    UserEntity findUser(Integer userId);

    /**
     * 根据用户ID删除用户信息
     * @param userId
     * @return
     */
    Integer deleteUser(Integer userId);

    /**
     * 创建用户
     * @param userInfo
     * @return
     */
    Integer createUser(UserCreateRequest userInfo);

    /**
     * 根据用户ID更新用户信息
     * @param userInfo
     * @return
     */
    Integer updateUser(UserUpdateRequest userInfo);
}
