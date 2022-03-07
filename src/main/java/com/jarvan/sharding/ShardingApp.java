package com.jarvan.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 描述：
 * Created by zjw on 2022/3/7 15:12
 */
@MapperScan(basePackages = {"com.jarvan.sharding.mapper"})
@SpringBootApplication
public class ShardingApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApp.class, args);
    }
}
