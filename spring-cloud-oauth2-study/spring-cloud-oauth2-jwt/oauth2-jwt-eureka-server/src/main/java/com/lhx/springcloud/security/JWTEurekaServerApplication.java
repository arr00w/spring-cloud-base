package com.lhx.springcloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JWTEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JWTEurekaServerApplication.class, args);
    }
}
