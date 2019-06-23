package cc.mrbird.system.domain;

import cc.mrbird.common.annotation.ExportConfig;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Table(name = "t_user")
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

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "USERNAME")
	@ExportConfig(value = "用户名")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "DEPT_ID")
	private Long deptId;

	@Transient
	@ExportConfig(value = "部门")
	private String deptName;

	@Column(name = "EMAIL")
	@ExportConfig(value = "邮箱")
	private String email;

	@Column(name = "MOBILE")
	@ExportConfig(value = "手机")
	private String mobile;

	@Column(name = "STATUS")
	@ExportConfig(value = "状态", convert = "s:0=锁定,1=有效")
	private String status = STATUS_VALID;

	@Column(name = "CRATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date crateTime;

	@Column(name = "MODIFY_TIME")
	private Date modifyTime;

	@Column(name = "LAST_LOGIN_TIME")
	private Date lastLoginTime;

	@Column(name = "SSEX")
	@ExportConfig(value = "性别", convert = "s:0=男,1=女,2=保密")
	private String ssex;

	@Column(name = "THEME")
	private String theme;

	@Column(name = "AVATAR")
	private String avatar;

	@Column(name = "DESCRIPTION")
	private String description;

	@Transient
	private String roleName;

	/**
	 * shiro-redis v3.1.0 必须要有getAuthCacheKey()或者getId()方法
	 * # Principal id field name. The field which you can get unique id to identify this principal.
	 * # For example, if you use UserInfo as Principal class, the id field maybe userId, userName, email, etc.
	 * # Remember to add getter to this id field. For example, getUserId(), getUserName(), getEmail(), etc.
	 * # Default value is authCacheKey or id, that means your principal object has a method called "getAuthCacheKey()" or "getId()"
	 * @return userId as Principal id field name
	 */
	public Long getAuthCacheKey() {
		return userId;
	}
}