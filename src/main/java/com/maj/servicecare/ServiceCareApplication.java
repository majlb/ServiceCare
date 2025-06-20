package com.maj.servicecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServiceCareApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCareApplication.class, args);
    }
}

