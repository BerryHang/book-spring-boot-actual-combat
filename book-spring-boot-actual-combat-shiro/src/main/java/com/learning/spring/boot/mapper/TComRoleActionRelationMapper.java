package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComRoleActionRelation;
import com.learning.spring.boot.domain.entity.TComRoleActionRelationExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * TComRoleActionRelationMapper继承基类
 */
@Mapper
public interface TComRoleActionRelationMapper extends BaseMapper<TComRoleActionRelation, Integer, TComRoleActionRelationExample> {
}