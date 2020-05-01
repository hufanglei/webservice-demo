package com.example.wscxfrest.configration;

import com.example.wscxfrest.dao.StudentInterface;
import com.example.wscxfrest.impl.StudentInterfaceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * cxf配置
 */
@Configuration
public class CxfConfig {


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus bus(){
        SpringBus bus=new SpringBus();
        return  bus;
    }

    @Bean
    public Server server() {
        JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
        bean.setBus(bus());
        bean.setAddress("/Class");
        bean.setServiceBeans(Arrays.asList(new StudentInterfaceImpl()));//如果有多个服务，这里可以接收List
        return bean.create();
    }
}