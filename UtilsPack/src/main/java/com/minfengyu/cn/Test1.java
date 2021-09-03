package com.minfengyu.cn;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@SpringBootApplication
@MapperScan("")
public class Test1 {

    public static void main(String[] args) {
        SpringApplication.run(Test1.class);
    }
}
