package com.springboot.practice.springbootdemo;


import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class DemoConfigBean {

    @Bean
    public Coach getCricketCoach() {
        return new CricketCoach();
    }
}
