package com.springboot.practice.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{

    public String getDailyWorkout() {
        return "Do 15 minutes of sprint.";
    }
}
