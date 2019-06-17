package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Role implements Serializable {

	private static final long serialVersionUID = -1714476694755654924L;

	private Long roleId;

	private String roleName;

	private String remark;

	private Date createTime;

	private Date modifyTime;

}