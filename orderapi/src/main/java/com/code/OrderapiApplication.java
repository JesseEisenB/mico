package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication //作为服务消费者
public class OrderapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderapiApplication.class, args);
    }

}
