package com.example.demo.controller;

import com.cad.cxf.WeatherInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: CXFTestController
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@RestController
public class CXFTestController {

    @Autowired
    private WeatherInterface weatherInterface;

    @GetMapping("/test")
    public String getWeather() {
        String message = weatherInterface.queryWeather("山东");
        System.out.println(message);
        return message;
    }

    @GetMapping("/test2")
    public String test2() {
        return "hellow";
    }
}
