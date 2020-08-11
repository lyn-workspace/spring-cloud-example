package com.spring.cloud.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudNacosDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosDiscoveryClientApplication.class, args);
    }

}
