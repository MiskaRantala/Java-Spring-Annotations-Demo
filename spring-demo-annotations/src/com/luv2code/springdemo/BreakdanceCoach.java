package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BreakdanceCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    @Autowired
    public BreakdanceCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
     */

    // gets breakdance workout
    @Override
    public String getDailyWorkout() {
        return "Breakdance: Do your best windmill 20 times";
    }

    // gets breakdance video infos
    @Override
    public String getDailyVideo() {
        return "Breakdance: Film 4 new combos";
    }

    // gets fortune
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
