package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class SysLog implements Serializable {

	private static final long serialVersionUID = -8878596941954995444L;

	private Long id;

	private String username;

	private String operation;

	private Long time;

	private String method;

	private String params;

	private String ip;

	private Date createTime;

	private String location;

	private String timeField;

}