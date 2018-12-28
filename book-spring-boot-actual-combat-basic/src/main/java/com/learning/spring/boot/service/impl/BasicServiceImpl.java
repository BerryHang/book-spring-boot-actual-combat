package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.domain.response.Author;
import com.learning.spring.boot.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 基础信息获取业务接口实现类
 * @Date: 2018/12/28 17:56
 */
@Service
public class BasicServiceImpl implements BasicService {

    @Autowired
    private Author author;

    @Override
    public String getAuthorInfo() {
        return author.toString();
    }
}
