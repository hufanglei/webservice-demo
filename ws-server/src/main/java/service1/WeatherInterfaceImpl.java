package service1;

import dao.WeatherInterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Title: WeatherInterfaceImpl1
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
@WebService(
        targetNamespace="http://service.cad.com",
        portName="WeatherSOAPPort",
        serviceName="WeatherWSS",
        name="WeatherSOAP"
)
public class WeatherInterfaceImpl implements WeatherInterface {

    @WebMethod(
            operationName="getWeather",
            exclude=false
    )

    @Override
    public @WebResult(name="result")String queryWeather(@WebParam(name="cityName")String cityName) {
        System.out.println("获取城市名"+cityName);
        String weather="暴雨";
        return weather;
    }

}
