package service2;

import service1.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

/**
 * Title: WeatherServer
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
public class WeatherServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:23456/weather", new WeatherInterfaceImpl());
    }
}
