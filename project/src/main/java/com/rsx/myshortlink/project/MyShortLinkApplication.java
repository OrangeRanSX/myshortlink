package com.rsx.myshortlink.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rsx.myshortlink.project.dao.mapper")
public class MyShortLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShortLinkApplication.class, args);
    }
}