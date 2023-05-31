package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer   //此注解表明该服务是一个eureka服务 ,作为一个而注册中心
@SpringBootApplication
public class EurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeApplication.class, args);
    }

}
