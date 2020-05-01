package dao;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

//2.创建一个SEI接口，需要在接口上添加@WebService注解
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
    public String queryWeather(String cityName);
}
