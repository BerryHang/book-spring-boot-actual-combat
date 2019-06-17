package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Menu implements Serializable {

	private static final long serialVersionUID = 7187628714679791771L;

	public static final String TYPE_MENU = "0";

	public static final String TYPE_BUTTON = "1";

	private Long menuId;

	private Long parentId;

	private String menuName;

	private String url;

	private String perms;

	private String icon;

	private String type;

	private Long orderNum;

	private Date createTime;

	private Date modifyTime;

}