package com.nacos.config.nacosconfigboot.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NacosPropertySource(dataId = "nacos-config-boot", autoRefreshed = true)
@RestController
public class NacosConfigController {


    @NacosValue(value = "${name:local name}", autoRefreshed = true)
    private String name;

    @GetMapping("/config")
    public String get() {
        return name;
    }
}
