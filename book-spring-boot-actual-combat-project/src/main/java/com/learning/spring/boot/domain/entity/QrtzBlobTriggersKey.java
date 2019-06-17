package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_blob_triggers
 * @author 
 */
public class QrtzBlobTriggersKey implements Serializable {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
}