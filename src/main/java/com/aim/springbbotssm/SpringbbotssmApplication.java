package com.aim.springbbotssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.aim.springbbotssm.dao"})
@SpringBootApplication
public class SpringbbotssmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbbotssmApplication.class, args);
    }

}
