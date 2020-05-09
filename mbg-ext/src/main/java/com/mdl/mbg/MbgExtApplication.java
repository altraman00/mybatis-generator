package com.mdl.mbg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.mdl.mbg.dao"})
public class MbgExtApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbgExtApplication.class, args);
    }

}
