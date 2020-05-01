package server;

import dao.WeatherInterface;
import impl.WeatherInterfaceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

//4.发布服务
public class WeatherServer {

    public static void main(String[] args) {
        //创建服务工厂Bean
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置服务接口
        jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务实现类
        jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
        //创建服务
        jaxWsServerFactoryBean.create();
    }

}
