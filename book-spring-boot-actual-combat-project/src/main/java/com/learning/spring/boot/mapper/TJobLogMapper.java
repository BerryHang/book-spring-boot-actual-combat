package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TJobLog;
import com.learning.spring.boot.domain.entity.TJobLogExample;

/**
 * TJobLogMapper继承基类
 */
public interface TJobLogMapper extends MyBatisBaseMapper<TJobLog, Long, TJobLogExample> {
}