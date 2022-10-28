package com.kimsmile.clone_instagram;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.kimsmile.clone_instagram.mapper"})
public class CloneInstagramApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloneInstagramApplication.class, args);
    }

}
