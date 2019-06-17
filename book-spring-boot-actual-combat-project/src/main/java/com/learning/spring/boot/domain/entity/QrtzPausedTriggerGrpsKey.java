package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_paused_trigger_grps
 * @author 
 */
public class QrtzPausedTriggerGrpsKey implements Serializable {
    private String schedName;

    private String triggerGroup;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
}