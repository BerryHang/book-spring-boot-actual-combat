package com.learning.spring.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author beibei.huang
 * @Title: FileUploadConfig
 * @ProjectName book-spring-boot-actual-combat-parent
 * @Description: 使用apache fileupload作为文件上传的配置类
 * @date 2018/11/8    15:45
 */
@Configuration
public class FileUploadConfig {
    @Bean
    public MultipartResolver custom() {
        return new CommonsMultipartResolver();
    }
}
