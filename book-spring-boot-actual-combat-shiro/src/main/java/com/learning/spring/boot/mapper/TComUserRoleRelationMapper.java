package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TComUserRoleRelation;
import com.learning.spring.boot.domain.entity.TComUserRoleRelationExample;
import org.springframework.stereotype.Repository;

/**
 * TComUserRoleRelationMapper继承基类
 */
@Repository
public interface TComUserRoleRelationMapper extends BaseMapper<TComUserRoleRelation, Integer, TComUserRoleRelationExample> {
}