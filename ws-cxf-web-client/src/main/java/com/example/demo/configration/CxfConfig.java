package com.example.demo.configration;

import com.cad.cxf.WeatherInterface;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Title: CxfConfig
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@Configuration
public class CxfConfig {

    @Value("${ws.address}")
    private String wsAddress;

    @Bean
    public WeatherInterface getWeather(){
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        //设置服务接口
        jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress(wsAddress);
        jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
        //获取服务接口实例
        return (WeatherInterface) jaxWsProxyFactoryBean.create();
    }
}
