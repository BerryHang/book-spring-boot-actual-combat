package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysUser;
import com.learning.spring.boot.domain.entity.TSysUserExample;
import org.springframework.stereotype.Repository;

/**
 * TSysUserMapper继承基类
 */
@Repository
public interface TSysUserMapper extends BaseMapper<TSysUser, Integer, TSysUserExample> {
}