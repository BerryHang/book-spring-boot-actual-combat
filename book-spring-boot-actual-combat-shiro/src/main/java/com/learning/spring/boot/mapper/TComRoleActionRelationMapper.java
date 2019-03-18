package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComRoleActionRelation;
import com.learning.spring.boot.domain.entity.TComRoleActionRelationExample;
import org.springframework.stereotype.Repository;

/**
 * TComRoleActionRelationMapper继承基类
 */
@Repository
public interface TComRoleActionRelationMapper extends BaseMapper<TComRoleActionRelation, Integer, TComRoleActionRelationExample> {
}