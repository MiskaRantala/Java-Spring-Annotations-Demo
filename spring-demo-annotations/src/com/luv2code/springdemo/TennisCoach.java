package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    // gets tennis workout
    @Override
    public String getDailyWorkout() {
        return "Tennis: Practice your backhand volley";
    }

    // gets tennis video infos
    @Override
    public String getDailyVideo() {
        return "Tennis: Film some hard Ace shots";
    }

}
