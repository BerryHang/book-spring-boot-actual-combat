package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComUserRoleRelation;
import com.learning.spring.boot.domain.entity.TComUserRoleRelationExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * TComUserRoleRelationMapper继承基类
 */
@Mapper
public interface TComUserRoleRelationMapper extends BaseMapper<TComUserRoleRelation, Integer, TComUserRoleRelationExample> {
}