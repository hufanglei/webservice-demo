package client;

import service2.WeatherInterfaceImpl1;
import service2.WeatherInterfaceImplService;

/**
 * Title: WeatherClient
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
public class WeatherClient {
    public static void main(String[] args) {
        //创建服务视图，视图是从wsdl文件的service标签的name属性获取
        WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();

        //获取服务实现类，实现类从wsdl文件的portType的name属性获取
        WeatherInterfaceImpl1 weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl1.class);
        //获取查询方法，从portType的operation标签获取
        String weather = weatherInterfaceImpl.queryWeather("北京");
        System.out.println(weather);

    }
}
