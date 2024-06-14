package com.springboot.practice.springbootdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "No need to workout today.";
    }
}
