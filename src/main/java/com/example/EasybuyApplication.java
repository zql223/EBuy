package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mapper")
@SpringBootApplication
public class EasybuyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasybuyApplication.class, args);
    }

}
