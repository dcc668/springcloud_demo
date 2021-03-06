package com.example;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by DongChenchen on 2018/9/29 0029
 */

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableEurekaClient
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run( AdminServerApplication.class, args );
    }
}
