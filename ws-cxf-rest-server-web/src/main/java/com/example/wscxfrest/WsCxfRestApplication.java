package com.example.wscxfrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//默认访问地址: http://127.0.0.1:8080/services/Class/Student/query/001
//自己配置的
// http://127.0.0.1:8080/ws/Class/Student/query/001
@SpringBootApplication
public class WsCxfRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsCxfRestApplication.class, args);
    }

}
