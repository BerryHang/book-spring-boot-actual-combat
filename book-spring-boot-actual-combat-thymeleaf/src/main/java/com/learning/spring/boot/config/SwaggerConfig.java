package com.learning.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author beibei.huang
 * @Title: SwaggerConfig
 * @ProjectName spring-boot-learning
 * @Description: Swagger2可视化接口配置
 * @date 2018/10/26    14:36
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.learning.spring.boot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring boot 使用Swagger 构建可视化 Restful API")
                .contact(new Contact("Berry Huang","http://localhost:8090/swagger-ui.html","")).version("1.0")
                .description("Spring boot 使用Swagger 构建可视化 Restful API")
                .build();
    }

}
