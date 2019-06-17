package com.learning.spring.boot.service.job.impl;

import com.google.common.collect.Lists;
import com.learning.spring.boot.annotation.CronTag;
import com.learning.spring.boot.domain.entity.TJob;
import com.learning.spring.boot.domain.entity.TJobExample;
import com.learning.spring.boot.domain.response.Job;
import com.learning.spring.boot.mapper.TJobMapper;
import com.learning.spring.boot.service.job.JobService;
import com.learning.spring.boot.util.ScheduleUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.reflections.Reflections;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service("JobService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class JobServiceImpl implements JobService {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private TJobMapper jobMapper;

    /**
     * 项目启动时，初始化定时器
     */
    @PostConstruct
    public void init() {
        List<Job> scheduleJobList = jobMapper.queryList();
        // 如果不存在，则创建
        scheduleJobList.forEach(scheduleJob -> {
            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
            if (cronTrigger == null) {
                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
            } else {
                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
            }
        });
    }

    @Override
    public Job findJob(Long jobId) {
        TJob tJob = jobMapper.selectByPrimaryKey(jobId);
        Job job = new Job();
        BeanUtils.copyProperties(tJob,job);
        return job;
    }

    @Override
    public List<TJob> findAllJobs(Job job) {
        TJobExample tJobExample = new TJobExample();
        TJobExample.Criteria criteria = tJobExample.createCriteria();
        if (StringUtils.isNotBlank(job.getBeanName())) {
            criteria.andBeanNameEqualTo(job.getBeanName());
        }
        if (StringUtils.isNotBlank(job.getMethodName())) {
            criteria.andMethodNameEqualTo(job.getMethodName());
        }
        if (StringUtils.isNotBlank(job.getStatus())) {
            criteria.andStatusEqualTo( job.getStatus());
        }
        tJobExample.setOrderByClause("job_id");
        return jobMapper.selectByExample(tJobExample);
    }

    @Override
    @Transactional
    public void addJob(Job job) {
        job.setCreateTime(new Date());
        job.setStatus(Job.ScheduleStatus.PAUSE.getValue());
        TJob tJob = new TJob();
        BeanUtils.copyProperties(job,tJob);
        jobMapper.insertSelective(tJob);
        ScheduleUtils.createScheduleJob(scheduler, job);
    }

    @Override
    @Transactional
    public void updateJob(Job job) {
        ScheduleUtils.updateScheduleJob(scheduler, job);
        TJob tJob = new TJob();
        BeanUtils.copyProperties(job,tJob);
        jobMapper.updateByPrimaryKeySelective(tJob);
    }

    @Override
    @Transactional
    public void deleteBatch(String jobIds) {
        List<String> list = Arrays.asList(jobIds.split(","));
        list.forEach(jobId -> ScheduleUtils.deleteScheduleJob(scheduler, Long.valueOf(jobId)));
        for (String id : list){
            jobMapper.deleteByPrimaryKey(Long.valueOf(id));
        }
    }

    @Override
    @Transactional
    public int updateBatch(String jobIds, String status) {
        List<String> list = Arrays.asList(jobIds.split(","));
        List<Long> idList = Lists.newArrayList();
        for (String id : list){
            idList.add(Long.valueOf(id));
        }
        TJobExample tJobExample = new TJobExample();
        tJobExample.createCriteria().andJobIdIn(idList);
        TJob job = new TJob();
        job.setStatus(status);
        return jobMapper.updateByExampleSelective(job, tJobExample);
    }

    @Override
    @Transactional
    public void run(String jobIds) {
        String[] list = jobIds.split(",");
        Arrays.stream(list).forEach(jobId -> ScheduleUtils.run(scheduler, findJob(Long.valueOf(jobId))));
    }

    @Override
    @Transactional
    public void pause(String jobIds) {
        String[] list = jobIds.split(",");
        Arrays.stream(list).forEach(jobId -> ScheduleUtils.pauseJob(scheduler, Long.valueOf(jobId)));
        this.updateBatch(jobIds, Job.ScheduleStatus.PAUSE.getValue());
    }

    @Override
    @Transactional
    public void resume(String jobIds) {
        String[] list = jobIds.split(",");
        Arrays.stream(list).forEach(jobId -> ScheduleUtils.resumeJob(scheduler, Long.valueOf(jobId)));
        this.updateBatch(jobIds, Job.ScheduleStatus.NORMAL.getValue());
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<Job> getSysCronClazz(Job job) {
        Reflections reflections = new Reflections("cc.mrbird.job.task");
        List<Job> jobList = new ArrayList<>();
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(CronTag.class);

        for (Class cls : annotated) {
            String clsSimpleName = cls.getSimpleName();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                Job job1 = new Job();
                String methodName = method.getName();
                Parameter[] methodParameters = method.getParameters();
                String params = String.format("%s(%s)", methodName, Arrays.stream(methodParameters).map(item -> item.getType().getSimpleName() + " " + item.getName()).collect(Collectors.joining(", ")));

                job1.setBeanName(StringUtils.uncapitalize(clsSimpleName));
                job1.setMethodName(methodName);
                job1.setParams(params);
                jobList.add(job1);
            }
        }
        return jobList;
    }

}
