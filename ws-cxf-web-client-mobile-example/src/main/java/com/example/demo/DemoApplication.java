package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//综合案例：手机归属地查询
//https://blog.csdn.net/c99463904/article/details/76140591
// > wsdl2java -p com.cad.mobile -d . http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
