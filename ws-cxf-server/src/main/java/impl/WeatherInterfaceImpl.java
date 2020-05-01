package impl;

import dao.WeatherInterface;

//3.创建SEI接口实现类
public class WeatherInterfaceImpl implements WeatherInterface {

    @Override
    public String queryWeather(String cityName) {
        if("山东".equals(cityName)) {
            return "热爆炸";
        }else {
            return "冰雹";
        }
    }
}