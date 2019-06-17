package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzCalendars;
import com.learning.spring.boot.domain.entity.QrtzCalendarsExample;
import com.learning.spring.boot.domain.entity.QrtzCalendarsKey;

/**
 * QrtzCalendarsMapper继承基类
 */
public interface QrtzCalendarsMapper extends MyBatisBaseMapper<QrtzCalendars, QrtzCalendarsKey, QrtzCalendarsExample> {
}