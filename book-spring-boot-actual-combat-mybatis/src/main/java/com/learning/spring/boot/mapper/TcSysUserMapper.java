package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.mapper
 * @ClassName: TcSysUserMapper
 * @Author: beibei.huang
 * @Description: 用户相关mapper接口
 * @Date: 2019/1/30 15:27
 */
@Mapper
public interface TcSysUserMapper {

    List<TcSysUserEntity> findUserList();

    TcSysUserEntity findUser(Long userId);

    Integer deleteUser(Long userId);

    Integer createUser(UserCreateRequest userInfo);

    Integer updateUser(UserUpdateRequest userInfo);
}
