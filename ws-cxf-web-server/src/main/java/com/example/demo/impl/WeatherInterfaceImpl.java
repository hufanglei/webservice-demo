package com.example.demo.impl;

import com.example.demo.dao.WeatherInterface;
import org.springframework.stereotype.Service;

//3.创建SEI实现类
@Service
public class WeatherInterfaceImpl implements WeatherInterface {

    @Override
    public String queryWeather(String cityName) {
        if("河南".equals(cityName)) {
            return "热爆炸";
        }else {
            return "冰雹";
        }
    }
}
