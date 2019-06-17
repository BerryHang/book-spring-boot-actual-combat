package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class User implements Serializable {

	private static final long serialVersionUID = -4852732617765810959L;
	/**
	 * 账户状态
	 */
	public static final String STATUS_VALID = "1";

	public static final String STATUS_LOCK = "0";

	public static final String DEFAULT_THEME = "green";

	public static final String DEFAULT_AVATAR = "default.jpg";

	/**
	 * 性别
	 */
	public static final String SEX_MALE = "0";

	public static final String SEX_FEMALE = "1";

	public static final String SEX_UNKNOW = "2";

	private Long userId;

	private String username;

	private String password;

	private Long deptId;

	private String deptName;

	private String email;

	private String mobile;

	private String status = STATUS_VALID;

	private Date crateTime;

	private Date modifyTime;

	private Date lastLoginTime;

	private String ssex;

	private String theme;

	private String avatar;

	private String description;

	private String roleName;

}