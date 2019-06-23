package cc.mrbird.system.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@Table(name = "t_user_role")
public class UserRole implements Serializable{
	
	private static final long serialVersionUID = -3166012934498268403L;

	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "ROLE_ID")
	private Long roleId;

}