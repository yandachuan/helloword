package com.hello.app;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.hello")
@EnableDubboConfiguration
@MapperScan("com.hello.dal.config.mapper")
public class UserAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserAppApplication.class,args);
    }
}
