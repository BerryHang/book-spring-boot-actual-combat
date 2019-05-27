package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.configuration.EmailProperties;
import com.learning.spring.boot.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: EmailServiceImpl
 * @Author: beibei.huang
 * @Description: 邮件相关业务操作实现类
 * @Date: 2019/5/24 9:56
 */
@Slf4j
@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailProperties emailProperties;

    @Value("${spring.mail.to.username}")
    private String mailTo;

    @Override
    public void sendSimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailProperties.getUsername());
        message.setTo(mailTo);
        message.setSubject("测试纯文件邮件发送");
        message.setText("测试纯文本邮件发送，此为文本内容。");
        javaMailSender.send(message);
    }

    @Override
    public void sendEnclosureEmail() {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(mimeMessage, true);

            helper.setFrom(emailProperties.getUsername());
            helper.setTo(mailTo);
            helper.setSubject("测试带附件的件邮件发送");
            helper.setText("<html><body>Email Img<img src='cid:qrCode'></body></html>",true);
            //添加附件
            File qrCode = new File("D:\\qrCode.jpg");
            //建议文件带上后缀，可支持在线预览
            helper.addAttachment("qrCode.jpg", qrCode);
            helper.addInline("qrCode", qrCode);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }

}
