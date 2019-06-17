package com.learning.spring.boot.service.job;

import com.learning.spring.boot.domain.entity.TJob;
import com.learning.spring.boot.domain.response.Job;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "JobService")
public interface JobService {

    Job findJob(Long jobId);

    List<TJob> findAllJobs(Job job);

    void addJob(Job job);

    void updateJob(Job job);

    void deleteBatch(String jobIds);

    int updateBatch(String jobIds, String status);

    void run(String jobIds);

    void pause(String jobIds);

    void resume(String jobIds);

    @Cacheable(key = "#p0")
    List<Job> getSysCronClazz(Job job);
}
