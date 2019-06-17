package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_scheduler_state
 * @author 
 */
public class QrtzSchedulerStateKey implements Serializable {
    private String schedName;

    private String instanceName;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
}