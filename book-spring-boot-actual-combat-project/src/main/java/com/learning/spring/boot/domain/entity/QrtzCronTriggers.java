package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_cron_triggers
 * @author 
 */
public class QrtzCronTriggers extends QrtzCronTriggersKey implements Serializable {
    private String cronExpression;

    private String timeZoneId;

    private static final long serialVersionUID = 1L;

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}