package com.qianxian.module.service;

import com.qianxian.module.fegin.TestSeataFegin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.qianxian.module"})
@EnableFeignClients
@EnableDiscoveryClient
public class ModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleApplication.class,args);
    }
}
