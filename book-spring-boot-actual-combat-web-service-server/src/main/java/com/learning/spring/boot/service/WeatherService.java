package com.learning.spring.boot.service;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: WeatherService
 * @Author: beibei.huang
 * @Description: 天气信息相关操作业务层
 * @Date: 2019/5/29 8:26
 */
public interface WeatherService {

    List<String> queryWeatherInfoByCity(String cityName);

}
