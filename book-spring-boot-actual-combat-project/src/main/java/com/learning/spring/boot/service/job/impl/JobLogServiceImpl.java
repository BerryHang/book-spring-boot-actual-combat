package com.learning.spring.boot.service.job.impl;

import com.learning.spring.boot.domain.entity.TJobLog;
import com.learning.spring.boot.domain.entity.TJobLogExample;
import com.learning.spring.boot.domain.response.JobLog;
import com.learning.spring.boot.mapper.TJobLogMapper;
import com.learning.spring.boot.service.job.JobLogService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service("JobLogService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class JobLogServiceImpl implements JobLogService {

	@Autowired
	private TJobLogMapper jobLogMapper;

	@Override
	public List<TJobLog> findAllJobLogs(JobLog jobLog) {
		TJobLogExample tJobLogExample = new TJobLogExample();
		TJobLogExample.Criteria criteria = tJobLogExample.createCriteria();
		if (StringUtils.isNotBlank(jobLog.getBeanName())) {
			criteria.andBeanNameEqualTo(jobLog.getBeanName());
		}
		if (StringUtils.isNotBlank(jobLog.getMethodName())) {
			criteria.andMethodNameEqualTo(jobLog.getMethodName());
		}
		if (StringUtils.isNotBlank(jobLog.getStatus())) {
			criteria.andStatusEqualTo( jobLog.getStatus());
		}
		tJobLogExample.setOrderByClause("log_id desc");

		return jobLogMapper.selectByExample(tJobLogExample);

	}

	@Override
	@Transactional
	public void saveJobLog(JobLog log) {
		TJobLog tJobLog = new TJobLog();
		BeanUtils.copyProperties(log,tJobLog);
		jobLogMapper.insertSelective(tJobLog);
	}

	@Override
	@Transactional
	public void deleteBatch(String jobLogIds) {
		String[] ids = jobLogIds.split(",");
		for (String id : ids){
			jobLogMapper.deleteByPrimaryKey(Long.valueOf(id));
		}
	}

}
