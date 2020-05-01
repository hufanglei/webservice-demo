package com.example.demo.client;

import com.cad.cxf.WeatherInterface;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

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
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        //设置服务接口
        jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/services/weather?wsdl");
        //获取服务接口实例
        WeatherInterface weatherInterface=(WeatherInterface) jaxWsProxyFactoryBean.create();
        //调用方法
        String message=weatherInterface.queryWeather("山东");
        System.out.println(message);
    }

}
