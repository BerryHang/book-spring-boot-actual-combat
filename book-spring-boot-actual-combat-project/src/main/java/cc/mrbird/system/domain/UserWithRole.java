package cc.mrbird.system.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserWithRole extends User{
	
	private static final long serialVersionUID = -5680235862276163462L;
	
	private Long roleId;
	
	private List<Long> roleIds;

}