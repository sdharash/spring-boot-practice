package com.springboot.practice.springbootdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HockeyCoach implements Coach{

    public String getDailyWorkout() {
        return "Do 15 minutes of sprint.";
    }
}
