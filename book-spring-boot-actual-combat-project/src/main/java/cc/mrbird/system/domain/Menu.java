package cc.mrbird.system.domain;

import cc.mrbird.common.annotation.ExportConfig;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Table(name = "t_menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 7187628714679791771L;

	public static final String TYPE_MENU = "0";

	public static final String TYPE_BUTTON = "1";

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "MENU_ID")
	@ExportConfig(value = "编号")
	private Long menuId;

	@Column(name = "PARENT_ID")
	private Long parentId;

	@Column(name = "MENU_NAME")
	@ExportConfig(value = "名称")
	private String menuName;

	@Column(name = "URL")
	@ExportConfig(value = "地址")
	private String url;

	@Column(name = "PERMS")
	@ExportConfig(value = "权限标识")
	private String perms;

	@Column(name = "ICON")
	@ExportConfig(value = "图标")
	private String icon;

	@Column(name = "TYPE")
	@ExportConfig(value = "类型", convert = "s:0=菜单,1=按钮")
	private String type;

	@Column(name = "ORDER_NUM")
	private Long orderNum;

	@Column(name = "CREATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

	@Column(name = "MODIFY_TIME")
	private Date modifyTime;

}