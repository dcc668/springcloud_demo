package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by DongChenchen on 2018/9/30 0030
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient          //向服务中心注册
@EnableHystrix  //避免连锁故障,在ribbon使用断路器
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class, args );
    }

    @Bean
    @LoadBalanced   //为restRemplate bean 开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
