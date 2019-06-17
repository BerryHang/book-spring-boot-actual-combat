package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * t_log
 * @author 
 */
public class TLogWithBLOBs extends TLog implements Serializable {
    /**
     * 操作内容
     */
    private String operation;

    /**
     * 操作方法
     */
    private String method;

    /**
     * 方法参数
     */
    private String params;

    private static final long serialVersionUID = 1L;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}