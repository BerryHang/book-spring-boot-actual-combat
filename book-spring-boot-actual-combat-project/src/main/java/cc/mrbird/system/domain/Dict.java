package cc.mrbird.system.domain;

import cc.mrbird.common.annotation.ExportConfig;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@ToString
@Table(name = "t_dict")
public class Dict implements Serializable{

	private static final long serialVersionUID = 7780820231535870010L;

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "DICT_ID")
	@ExportConfig(value = "字典ID")
	private Long dictId;

	@Column(name = "KEYY")
	@ExportConfig(value = "字典Key")
	private String keyy;

	@Column(name = "VALUEE")
	@ExportConfig(value = "字典Value")
	private String valuee;

	@Column(name = "TABLE_NAME")
	@ExportConfig(value = "表名")
	private String tableName;

	@Column(name = "FIELD_NAME")
	@ExportConfig(value = "列名")
	private String fieldName;

}