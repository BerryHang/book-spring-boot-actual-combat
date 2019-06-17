package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.response.UserOnline;

import java.util.List;

public interface SessionService {

	List<UserOnline> list();

	boolean forceLogout(String sessionId);
}
