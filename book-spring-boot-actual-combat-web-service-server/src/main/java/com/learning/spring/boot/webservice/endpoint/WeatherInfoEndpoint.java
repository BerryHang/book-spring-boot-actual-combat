package com.learning.spring.boot.webservice.endpoint;

import com.learning.spring.boot.service.WeatherService;
import com.learning.spring.boot.webservice.constant.WsConstant;
import com.learning.spring.boot.webservice.server.WeatherInfo;
import com.learning.spring.boot.webservice.server.WeatherInfoRequest;
import com.learning.spring.boot.webservice.server.WeatherInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.webservice.endpoint
 * @ClassName: WeatherInfoEndpoint
 * @Author: beibei.huang
 * @Description: 天气信息webservice发布
 * @Date: 2019/5/31 8:11
 */
@Endpoint
public class WeatherInfoEndpoint {
    @Autowired
    private WeatherService weatherService;

    @PayloadRoot(namespace = WsConstant.NAMESPACE_URI, localPart = "weatherInfoRequest")
    @ResponsePayload
    public WeatherInfoResponse getWeatherInfo(@RequestPayload WeatherInfoRequest weatherInfoRequest){
        WeatherInfoResponse weatherInfoResponse = new WeatherInfoResponse();
        WeatherInfo weatherInfo = new WeatherInfo();
        List<String> weatherInfoList = weatherService.queryWeatherInfoByCity(weatherInfoRequest.getCityName());
        weatherInfo.setProvinceName(weatherInfoList.get(0));
        weatherInfo.setCityName(weatherInfoList.get(1));
        weatherInfo.setCityCode(weatherInfoList.get(2));
        weatherInfo.setTemperature(weatherInfoList.get(5));
        weatherInfo.setSurvey(weatherInfoList.get(6));
        weatherInfo.setWindPower(weatherInfoList.get(7));
        weatherInfoResponse.setWeatherInfo(weatherInfo);
        return weatherInfoResponse;
    }
}
