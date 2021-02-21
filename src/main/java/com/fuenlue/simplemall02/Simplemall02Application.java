package com.fuenlue.simplemall02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fuenlue.simplemall02.mapper")
public class Simplemall02Application {

    public static void main(String[] args) {
        SpringApplication.run(Simplemall02Application.class, args);
    }

}
