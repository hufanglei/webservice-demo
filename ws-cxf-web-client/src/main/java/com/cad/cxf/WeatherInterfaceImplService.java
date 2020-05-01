package com.cad.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-05-01T13:09:34.450+08:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "WeatherInterfaceImplService",
                  wsdlLocation = "http://localhost:8080/services/weather?wsdl",
                  targetNamespace = "http://impl.demo.example.com/")
public class WeatherInterfaceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.demo.example.com/", "WeatherInterfaceImplService");
    public final static QName WeatherInterfaceImplPort = new QName("http://impl.demo.example.com/", "WeatherInterfaceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherInterfaceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherInterfaceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WeatherInterfaceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterface getWeatherInterfaceImplPort() {
        return super.getPort(WeatherInterfaceImplPort, WeatherInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterface getWeatherInterfaceImplPort(WebServiceFeature... features) {
        return super.getPort(WeatherInterfaceImplPort, WeatherInterface.class, features);
    }

}