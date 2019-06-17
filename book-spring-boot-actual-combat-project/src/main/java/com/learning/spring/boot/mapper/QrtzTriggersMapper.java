package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzTriggers;
import com.learning.spring.boot.domain.entity.QrtzTriggersExample;
import com.learning.spring.boot.domain.entity.QrtzTriggersKey;

/**
 * QrtzTriggersMapper继承基类
 */
public interface QrtzTriggersMapper extends MyBatisBaseMapper<QrtzTriggers, QrtzTriggersKey, QrtzTriggersExample> {
}