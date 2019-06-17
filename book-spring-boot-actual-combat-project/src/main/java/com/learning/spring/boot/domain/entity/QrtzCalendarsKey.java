package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_calendars
 * @author 
 */
public class QrtzCalendarsKey implements Serializable {
    private String schedName;

    private String calendarName;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }
}