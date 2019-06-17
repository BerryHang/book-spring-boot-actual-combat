package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_scheduler_state
 * @author 
 */
public class QrtzSchedulerState extends QrtzSchedulerStateKey implements Serializable {
    private Long lastCheckinTime;

    private Long checkinInterval;

    private static final long serialVersionUID = 1L;

    public Long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(Long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public Long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(Long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }
}