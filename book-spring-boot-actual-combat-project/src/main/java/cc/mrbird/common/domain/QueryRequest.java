package cc.mrbird.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class QueryRequest implements Serializable {

	private static final long serialVersionUID = -4869594085374385813L;

	private int pageSize;
	private int pageNum;

}
