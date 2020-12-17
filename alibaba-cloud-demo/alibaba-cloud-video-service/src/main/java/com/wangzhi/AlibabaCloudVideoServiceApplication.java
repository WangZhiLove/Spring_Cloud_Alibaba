package com.wangzhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudVideoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudVideoServiceApplication.class, args);
    }

}
