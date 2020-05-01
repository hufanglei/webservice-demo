package com.example.demo.cxf;

import javax.xml.ws.Endpoint;

import com.example.demo.dao.WeatherInterface;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * cxf配置
 */
@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private WeatherInterface weatherInterface;

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, weatherInterface);
        endpoint.publish("/weather");
        return endpoint;
    }
}