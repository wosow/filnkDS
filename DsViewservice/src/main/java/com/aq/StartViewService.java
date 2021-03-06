package com.aq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 */
@SpringBootApplication
@EnableFeignClients
public class StartViewService {
    public static void main(String[] args) {
        SpringApplication.run(StartViewService.class,args);
    }
}
