package com.learning.spring.boot.service.job;

import com.learning.spring.boot.domain.entity.TJobLog;
import com.learning.spring.boot.domain.response.JobLog;

import java.util.List;

public interface JobLogService {

	List<TJobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);

	void deleteBatch(String jobLogIds);
}
