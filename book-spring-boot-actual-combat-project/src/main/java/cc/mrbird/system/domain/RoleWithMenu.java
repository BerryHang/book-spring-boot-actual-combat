package cc.mrbird.system.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RoleWithMenu extends Role{

	private static final long serialVersionUID = 2013847071068967187L;
	
	private Long menuId;
	
	private List<Long> menuIds;

}
