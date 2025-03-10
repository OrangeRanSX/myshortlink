package com.rsx.myshortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rsx.myshortlink.admin.dao.mapper")
public class MyShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShortLinkAdminApplication.class, args);
    }
}
