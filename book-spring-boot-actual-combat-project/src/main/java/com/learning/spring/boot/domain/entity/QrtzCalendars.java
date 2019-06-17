package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_calendars
 * @author 
 */
public class QrtzCalendars extends QrtzCalendarsKey implements Serializable {
    private byte[] calendar;

    private static final long serialVersionUID = 1L;

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}