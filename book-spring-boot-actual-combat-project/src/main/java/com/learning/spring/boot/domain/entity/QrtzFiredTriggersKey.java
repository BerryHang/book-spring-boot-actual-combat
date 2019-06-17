package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_fired_triggers
 * @author 
 */
public class QrtzFiredTriggersKey implements Serializable {
    private String schedName;

    private String entryId;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }
}