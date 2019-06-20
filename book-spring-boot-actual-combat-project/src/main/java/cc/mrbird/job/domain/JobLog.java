package cc.mrbird.job.domain;

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
@Table(name = "t_job_log")
public class JobLog implements Serializable {

	private static final long serialVersionUID = -7114915445674333148L;

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "LOG_ID")
	private Long logId;

	@Column(name = "JOB_ID")
	@ExportConfig("任务ID")
	private Long jobId;

	@Column(name = "BEAN_NAME")
	@ExportConfig(value = "Bean名称")
	private String beanName;

	@Column(name = "METHOD_NAME")
	@ExportConfig(value = "方法名称")
	private String methodName;

	@Column(name = "PARAMS")
	@ExportConfig(value = "参数")
	private String params;

	@Column(name = "STATUS")
	@ExportConfig(value = "状态", convert = "s:0=成功,1=失败")
	private String status;

	@Column(name = "ERROR")
	@ExportConfig(value = "异常信息")
	private String error;

	@Column(name = "TIMES")
	@ExportConfig(value = "耗时（毫秒）")
	private Long times;

	@Column(name = "CREATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

}