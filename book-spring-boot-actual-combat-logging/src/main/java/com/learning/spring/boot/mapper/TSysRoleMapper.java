package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysRole;
import com.learning.spring.boot.domain.entity.TSysRoleExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * TSysRoleMapper继承基类
 */
@Mapper
public interface TSysRoleMapper extends BaseMapper<TSysRole, Integer, TSysRoleExample> {

    List<TSysRole> getRoleByIds(Set<Integer> roleIds);

}