package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_job_details
 * @author 
 */
public class QrtzJobDetailsKey implements Serializable {
    private String schedName;

    private String jobName;

    private String jobGroup;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
}