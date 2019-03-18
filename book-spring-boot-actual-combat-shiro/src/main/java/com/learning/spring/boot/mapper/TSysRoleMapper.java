package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysRole;
import com.learning.spring.boot.domain.entity.TSysRoleExample;
import org.springframework.stereotype.Repository;

/**
 * TSysRoleMapper继承基类
 */
@Repository
public interface TSysRoleMapper extends BaseMapper<TSysRole, Integer, TSysRoleExample> {
}