package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzFiredTriggers;
import com.learning.spring.boot.domain.entity.QrtzFiredTriggersExample;
import com.learning.spring.boot.domain.entity.QrtzFiredTriggersKey;

/**
 * QrtzFiredTriggersMapper继承基类
 */
public interface QrtzFiredTriggersMapper extends MyBatisBaseMapper<QrtzFiredTriggers, QrtzFiredTriggersKey, QrtzFiredTriggersExample> {
}