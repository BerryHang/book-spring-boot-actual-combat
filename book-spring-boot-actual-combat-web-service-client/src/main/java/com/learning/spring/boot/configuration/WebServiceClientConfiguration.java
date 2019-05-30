package com.learning.spring.boot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: WebServiceClientConfiguration
 * @Author: beibei.huang
 * @Description: web service 客户端配置
 * @Date: 2019/5/30 8:59
 */
@Configuration
public class WebServiceClientConfiguration {

    @Autowired
    private WebServiceGatewaySupport webServiceGatewaySupport;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        //会扫描此类下面的对应的 jaxb2实体类 因为是使用 Marshaller和 unmarshaller来进行xml和bean直接转换的
        //具体是判断此路径下是否包含 ObjectFactory.class 文件
        //设置 JAXBContext 对象
        marshaller.setContextPath("com.learning.spring.boot.webservice.client");
        //或者使用 以下方式设置
//        marshaller.setPackagesToScan(packagesToScan);
//        marshaller.setClassesToBeBound(classesToBeBound);
        return marshaller;
    }

    /*
     * 创建bean
     */
    @Bean
    public WebServiceGatewaySupport wsClient(Jaxb2Marshaller marshaller) {
        //默认对应的ws服务地址 client请求中还能动态修改的
        webServiceGatewaySupport.setDefaultUri("http://www.webxml.com.cn//WebServices/WeatherWebService.asmx/");
        webServiceGatewaySupport.setMarshaller(marshaller);//指定转换类
        webServiceGatewaySupport.setUnmarshaller(marshaller);
        return webServiceGatewaySupport;
    }
}
