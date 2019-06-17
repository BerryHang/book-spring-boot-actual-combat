package com.learning.spring.boot.service.system.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.spring.boot.annotation.Log;
import com.learning.spring.boot.domain.entity.TLog;
import com.learning.spring.boot.domain.entity.TLogExample;
import com.learning.spring.boot.domain.response.SysLog;
import com.learning.spring.boot.mapper.TLogMapper;
import com.learning.spring.boot.service.system.LogService;
import com.learning.spring.boot.util.AddressUtils;
import com.learning.spring.boot.util.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.*;

@Slf4j
@Service("logService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class LogServiceImpl implements LogService {

    @Autowired
    private TLogMapper logMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<TLog> findAllLogs(SysLog sysLog) {
        TLogExample tLogExample = new TLogExample();
        TLogExample.Criteria criteria = tLogExample.createCriteria();

        if (StringUtils.isNotBlank(sysLog.getUsername())) {
            criteria.andUsernameEqualTo(sysLog.getUsername().toLowerCase());
        }
        if (StringUtils.isNotBlank(sysLog.getOperation())) {
            criteria.andOperationLike( sysLog.getOperation() );
        }
        if (StringUtils.isNotBlank(sysLog.getTimeField())) {
            String[] timeArr = sysLog.getTimeField().split("~");

            criteria.andCreateTimeGreaterThanOrEqualTo(DateUtil.parse(timeArr[0], "yyyy-MM-dd"));

            criteria.andCreateTimeLessThanOrEqualTo(DateUtil.parse(timeArr[1], "yyyy-MM-dd"));

        }
        tLogExample.setOrderByClause("create_time desc");
        return logMapper.selectByExample(tLogExample);
    }

    @Override
    @Transactional
    public void deleteLogs(String logIds) {
        List<String> list = Arrays.asList(logIds.split(","));
        for (String id : list){
            logMapper.deleteByPrimaryKey(Long.valueOf(id));
        }
    }

    @Override
    public void saveLog(ProceedingJoinPoint joinPoint, SysLog log) throws JsonProcessingException {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Log logAnnotation = method.getAnnotation(Log.class);
        if (logAnnotation != null) {
            // 注解上的描述
            log.setOperation(logAnnotation.value());
        }
        // 请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        // 请求的方法名
        String methodName = signature.getName();
        log.setMethod(className + "." + methodName + "()");
        // 请求的方法参数值
        Object[] args = joinPoint.getArgs();
        // 请求的方法参数名称
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        String[] paramNames = u.getParameterNames(method);
        if (args != null && paramNames != null) {
            StringBuilder params = new StringBuilder();
            params = handleParams(params, args, Arrays.asList(paramNames));
            log.setParams(params.toString());
        }
        log.setCreateTime(new Date());
        log.setLocation(AddressUtils.getCityInfo(log.getIp()));
        // 保存系统日志
        TLog tLog = new TLog();
        BeanUtils.copyProperties(log,tLog);
        logMapper.insertSelective(tLog);
    }

    private StringBuilder handleParams(StringBuilder params, Object[] args, List paramNames) throws JsonProcessingException {
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Map) {
                Set set = ((Map) args[i]).keySet();
                List list = new ArrayList();
                List paramList = new ArrayList<>();
                for (Object key : set) {
                    list.add(((Map) args[i]).get(key));
                    paramList.add(key);
                }
                return handleParams(params, list.toArray(), paramList);
            } else {
                if (args[i] instanceof Serializable) {
                    Class<?> aClass = args[i].getClass();
                    try {
                        aClass.getDeclaredMethod("toString", new Class[]{null});
                        // 如果不抛出NoSuchMethodException 异常则存在 toString 方法 ，安全的writeValueAsString ，否则 走 Object的 toString方法
                        params.append("  ").append(paramNames.get(i)).append(": ").append(objectMapper.writeValueAsString(args[i]));
                    } catch (NoSuchMethodException e) {
                        params.append("  ").append(paramNames.get(i)).append(": ").append(objectMapper.writeValueAsString(args[i].toString()));
                    }
                } else if (args[i] instanceof MultipartFile) {
                    MultipartFile file = (MultipartFile) args[i];
                    params.append("  ").append(paramNames.get(i)).append(": ").append(file.getName());
                } else {
                    params.append("  ").append(paramNames.get(i)).append(": ").append(args[i]);
                }
            }
        }
        return params;
    }
}


