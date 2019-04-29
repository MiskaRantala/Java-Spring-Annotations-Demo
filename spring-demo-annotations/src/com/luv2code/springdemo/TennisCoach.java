package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

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

    // gets fortune
    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
