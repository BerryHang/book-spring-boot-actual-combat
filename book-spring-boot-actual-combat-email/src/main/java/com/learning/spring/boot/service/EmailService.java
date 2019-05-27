package com.learning.spring.boot.service;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: EmailService
 * @Author: beibei.huang
 * @Description: 邮件相关业务操作接口
 * @Date: 2019/5/24 9:55
 */
public interface EmailService {

    void sendSimpleEmail();

    void sendEnclosureEmail();

}
