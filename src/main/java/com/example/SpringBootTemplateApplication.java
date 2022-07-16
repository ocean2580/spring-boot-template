package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@MapperScan("com.example.mapper")   // 指定被代理类所属包
public class SpringBootTemplateApplication {

    public static void main(String[] args) {
        // 获得容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootTemplateApplication.class, args);
    }

}
