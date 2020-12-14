package com.cloud.dubbo.dubboprovider.demos.dubboprovider;

import com.alibaba.cloud.demo.dubbo.me.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "[ECHO] " + name;
    }
}
