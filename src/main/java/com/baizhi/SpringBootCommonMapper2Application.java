package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.baizhi.mapper")
@SpringBootApplication
public class SpringBootCommonMapper2Application {


    public static void main(String[] args) {
        System.out.println("2222222222222222222");
        SpringApplication.run(SpringBootCommonMapper2Application.class, args);
    }

}

