package cc.mrbird.job.dao;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.job.domain.Job;

import java.util.List;

public interface JobMapper extends MyMapper<Job> {
	
	List<Job> queryList();
}