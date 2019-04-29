package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BreakdanceCoach implements Coach {

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

}
