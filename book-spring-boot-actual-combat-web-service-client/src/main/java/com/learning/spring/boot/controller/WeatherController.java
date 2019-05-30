package com.learning.spring.boot.controller;

import com.learning.spring.boot.service.WeatherService;
import com.learning.spring.boot.webservice.client.GetWeatherbyCityNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: WeatherController
 * @Author: beibei.huang
 * @Description: 天气信息控制器
 * @Date: 2019/5/29 8:26
 */
@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("city/{cityName}")
    public List<String> queryWeatherInfoByCity(@PathVariable("cityName") String cityName){
        return weatherService.queryWeatherInfoByCity(cityName);
    }

    @GetMapping("/{cityName}")
    public GetWeatherbyCityNameResponse queryWeatherInfoByCityName(@PathVariable("cityName") String cityName){
        return weatherService.queryWeatherInfoByCityName(cityName);
    }
}
