package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TDict;
import com.learning.spring.boot.domain.entity.TDictExample;

/**
 * TDictMapper继承基类
 */
public interface TDictMapper extends MyBatisBaseMapper<TDict, Long, TDictExample> {
}