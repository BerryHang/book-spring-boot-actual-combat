package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComRoleMenuRelation;
import com.learning.spring.boot.domain.entity.TComRoleMenuRelationExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * TComRoleMenuRelationMapper继承基类
 */
@Mapper
public interface TComRoleMenuRelationMapper extends BaseMapper<TComRoleMenuRelation, Integer, TComRoleMenuRelationExample> {
    List<TComRoleMenuRelation> getMenuByIds(Set<Integer> roles);
}