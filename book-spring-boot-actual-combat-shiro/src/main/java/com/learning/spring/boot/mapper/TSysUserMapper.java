package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysUser;
import com.learning.spring.boot.domain.entity.TSysUserExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * TSysUserMapper继承基类
 */
@Mapper
public interface TSysUserMapper extends BaseMapper<TSysUser, Integer, TSysUserExample> {
}