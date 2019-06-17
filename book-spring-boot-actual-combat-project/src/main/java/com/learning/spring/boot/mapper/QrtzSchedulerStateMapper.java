package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzSchedulerState;
import com.learning.spring.boot.domain.entity.QrtzSchedulerStateExample;
import com.learning.spring.boot.domain.entity.QrtzSchedulerStateKey;

/**
 * QrtzSchedulerStateMapper继承基类
 */
public interface QrtzSchedulerStateMapper extends MyBatisBaseMapper<QrtzSchedulerState, QrtzSchedulerStateKey, QrtzSchedulerStateExample> {
}