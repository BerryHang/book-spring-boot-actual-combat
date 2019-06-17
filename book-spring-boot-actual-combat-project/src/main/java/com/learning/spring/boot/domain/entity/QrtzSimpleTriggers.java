package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_simple_triggers
 * @author 
 */
public class QrtzSimpleTriggers extends QrtzSimpleTriggersKey implements Serializable {
    private Long repeatCount;

    private Long repeatInterval;

    private Long timesTriggered;

    private static final long serialVersionUID = 1L;

    public Long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
}