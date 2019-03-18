package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComRoleMenuRelation;
import com.learning.spring.boot.domain.entity.TComRoleMenuRelationExample;
import org.springframework.stereotype.Repository;

/**
 * TComRoleMenuRelationMapper继承基类
 */
@Repository
public interface TComRoleMenuRelationMapper extends BaseMapper<TComRoleMenuRelation, Integer, TComRoleMenuRelationExample> {
}