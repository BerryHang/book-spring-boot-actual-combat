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
@Table(name = "t_dept")
public class Dept implements Serializable {

	private static final long serialVersionUID = -7790334862410409053L;

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "DEPT_ID")
	@ExportConfig(value = "编号")
	private Long deptId;

	@Column(name = "PARENT_ID")
	private Long parentId;

	@Column(name = "DEPT_NAME")
	@ExportConfig(value = "部门名称")
	private String deptName;

	@Column(name = "ORDER_NUM")
	private Long orderNum;

	@Column(name = "CREATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

}