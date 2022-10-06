package com.me.dataentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.me" })
@EnableAutoConfiguration
public class DataEntryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataEntryApplication.class, args);
    }
   
}
