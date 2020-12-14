package com.alibaba.cloud.nacosconfigcloud.domain;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@ConfigurationProperties(prefix = "user")
@Data
public class User implements InitializingBean, DisposableBean {

    private String name;

    private int age;

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy : " + toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet : " + toString());
    }
}
