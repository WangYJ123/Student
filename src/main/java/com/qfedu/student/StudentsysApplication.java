package com.qfedu.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qfedu.stufdentsys.dao")
public class StudentsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsysApplication.class, args);
    }

}
