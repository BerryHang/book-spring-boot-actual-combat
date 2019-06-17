package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Dept implements Serializable {

	private static final long serialVersionUID = -7790334862410409053L;

	private Long deptId;

	private Long parentId;

	private String deptName;

	private Long orderNum;

	private Date createTime;

}