package com.nacos.config.nacosconfigboot;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NacosConfigBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigBootApplication.class, args);
    }

}
