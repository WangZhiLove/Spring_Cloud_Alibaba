package com.alibaba.cloud.nacosconfigcloud;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacosconfigcloud.domain.User;
import com.alibaba.nacos.api.config.listener.AbstractListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

@SpringBootApplication
@RefreshScope
@RestController
@EnableConfigurationProperties(User.class)
public class NacosConfigCloudApplication {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int age;

    private User user;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @PostConstruct
    public void init() {
        System.out.println("userName : " + userName + "------age" + age);
    }

    @GetMapping("/config")
    public String config() {
        return userName + " : " + age;
    }

    @GetMapping("/user")
    public String user() {
        return user.toString();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NacosConfigCloudApplication.class, args);
        String name = context.getEnvironment().getProperty("user.name");
        String age = context.getEnvironment().getProperty("user.age");
        System.out.println(name + " : " + age);
    }

    private NacosConfigManager nacosConfigManager;

    @Autowired
    public void setNacosConfigManager(NacosConfigManager nacosConfigManager) {
        this.nacosConfigManager = nacosConfigManager;
    }




    /**
     * runner方法 通过NacosConfigManager Bean 获取 ConfigService，增加 AbstractListener 的实现来用来监听指定dataId和group的配置内容
     * @return
     */
    @Bean
    public ApplicationRunner runner() {
       return args -> {
         String dataId = "nacos-config-cloud.properties";
         String group = "DEFAULT_GROUP";
           nacosConfigManager.getConfigService().addListener(dataId, group, new AbstractListener() {
               @Override
               public void receiveConfigInfo(String s) {
                   System.out.println("[Listener] " + s);
                   System.out.println("Before User: " + user);

                   Properties properties = new Properties();
                   try {
                       properties.load(new StringReader(s));
                       String name = properties.getProperty("user.name");
                       String age = properties.getProperty("user.age");
                       user.setName(name);
                       user.setAge(Integer.parseInt(age));
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   System.out.println("After User : " + user);
               }
           });
       };
    }

}
