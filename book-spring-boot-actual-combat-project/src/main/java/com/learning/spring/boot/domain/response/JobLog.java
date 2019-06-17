package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class JobLog implements Serializable {

	private static final long serialVersionUID = -7114915445674333148L;

	private Long logId;

	private Long jobId;

	private String beanName;

	private String methodName;

	private String params;

	private String status;

	private String error;

	private Long times;

	private Date createTime;

}