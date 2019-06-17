package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TUser;
import com.learning.spring.boot.domain.entity.TUserExample;
import com.learning.spring.boot.domain.response.User;
import com.learning.spring.boot.domain.response.UserWithRole;

import java.util.List;

/**
 * TUserMapper继承基类
 */
public interface TUserMapper extends MyBatisBaseMapper<TUser, Long, TUserExample> {
    List<TUser> findUserWithDept(User user);

    List<UserWithRole> findUserWithRole(Long userId);

    User findUserProfile(User user);
}