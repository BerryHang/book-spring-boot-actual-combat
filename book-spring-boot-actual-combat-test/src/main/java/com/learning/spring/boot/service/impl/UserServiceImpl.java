package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.dao.UserDao;
import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import com.learning.spring.boot.service.UserService;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: UserServiceImpl
 * @Author: beibei.huang
 * @Description: 用户业务操作类
 * @Date: 2019/1/21 11:09
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public List<UserEntity> findUserList(){
       return userDao.findUserList();
    }

    @Override
    public UserEntity findUser(Integer userId) {
        return userDao.findUser(userId);
    }

    @Override
    public Integer deleteUser(Integer userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public Integer createUser(UserCreateRequest userInfo) {
        return userDao.createUser(userInfo);
    }

    @Override
    public Integer updateUser(UserUpdateRequest userInfo) {
        return userDao.updateUser(userInfo);
    }

}
