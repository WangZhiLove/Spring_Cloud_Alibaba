package com.wangzhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaCloudOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudOrderServiceApplication.class, args);
    }

}
