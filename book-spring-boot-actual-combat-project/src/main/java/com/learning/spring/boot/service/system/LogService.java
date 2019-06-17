package com.learning.spring.boot.service.system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.learning.spring.boot.domain.entity.TLog;
import com.learning.spring.boot.domain.response.SysLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface LogService {
	
	List<TLog> findAllLogs(SysLog log);
	
	void deleteLogs(String logIds);

	@Async
	void saveLog(ProceedingJoinPoint point, SysLog log) throws JsonProcessingException;
}
