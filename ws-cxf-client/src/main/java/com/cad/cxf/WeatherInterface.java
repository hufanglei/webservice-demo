package com.cad.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-05-01T12:34:57.838+08:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://dao/", name = "WeatherInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherInterface {

    @WebMethod
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://dao/", className = "com.cad.cxf.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://dao/", className = "com.cad.cxf.QueryWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
