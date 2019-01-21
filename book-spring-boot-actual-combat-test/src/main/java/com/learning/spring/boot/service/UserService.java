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

    List<UserEntity> findUserList();

    UserEntity findUser(Integer userId);

    Integer deleteUser(Integer userId);

    Integer createUser(UserCreateRequest userInfo);

    Integer updateUser(UserUpdateRequest userInfo);
}
