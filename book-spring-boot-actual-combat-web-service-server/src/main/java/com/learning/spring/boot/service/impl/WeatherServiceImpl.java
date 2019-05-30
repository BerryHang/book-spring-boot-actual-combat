package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.service.WeatherService;
import com.learning.spring.boot.webservice.client.*;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: WeatherServiceImpl
 * @Author: beibei.huang
 * @Description: 天气信息相关业务操作实现类
 * @Date: 2019/5/29 8:27
 */
@Service
public class WeatherServiceImpl extends WebServiceGatewaySupport implements WeatherService {
    @Override
    public List<String> queryWeatherInfoByCity(String cityName) {
        WeatherWebService weatherWebService = new WeatherWebService();
        WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        ArrayOfString weatherInfo = weatherWebServiceSoap.getWeatherbyCityName(cityName);
        return weatherInfo.getString();
    }

    @Override
    public GetWeatherbyCityNameResponse queryWeatherInfoByCityName(String cityName) {
        GetWeatherbyCityName cityInfo = new GetWeatherbyCityName();
        cityInfo.setTheCityName(cityName);
        Object o = getWebServiceTemplate().marshalSendAndReceive(cityInfo);
        return new GetWeatherbyCityNameResponse();
    }

}
