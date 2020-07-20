package com.sinosoft.capacity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class })
@MapperScan("com.sinosoft.capacity.db.dao")
public class CapacityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapacityApplication.class, args);
    }

}
