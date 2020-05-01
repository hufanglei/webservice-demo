package service2;


import dao.WeatherInterface;

import javax.jws.WebService;

/**
 * Title: WeatherInterfaceImpl1
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@WebService
public class WeatherInterfaceImpl1 implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        System.out.println("获取城市名" + cityName);
        String weather = "暴雨";
        return weather;
    }
}
