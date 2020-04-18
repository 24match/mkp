package com.drew.mkp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 项目入口
 */
@SpringBootApplication(scanBasePackages = "com.drew.mkp")
@EnableTransactionManagement
@MapperScan("com.drew.mkp.mapper")
public class MkpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MkpApplication.class, args);
    }

}
