package cc.mrbird.system.domain;

import cc.mrbird.common.annotation.ExportConfig;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Table(name = "t_log")
public class SysLog implements Serializable {

	private static final long serialVersionUID = -8878596941954995444L;

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "ID")
	private Long id;

	@Column(name = "USERNAME")
	@ExportConfig(value = "操作用户")
	private String username;

	@Column(name = "OPERATION")
	@ExportConfig(value = "描述")
	private String operation;

	@Column(name = "TIME")
	@ExportConfig(value = "耗时（毫秒）")
	private Long time;

	@Column(name = "METHOD")
	@ExportConfig(value = "操作方法")
	private String method;

	@Column(name = "PARAMS")
	@ExportConfig(value = "参数")
	private String params;

	@Column(name = "IP")
	@ExportConfig(value = "IP地址")
	private String ip;

	@Column(name = "CREATE_TIME")
	@ExportConfig(value = "操作时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

	@Column(name = "LOCATION")
	@ExportConfig(value = "地点")
	private String location;
	
	// 用于搜索条件中的时间字段
	@Transient
	private String timeField;

}