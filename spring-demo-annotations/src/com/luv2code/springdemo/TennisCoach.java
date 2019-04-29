package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
    }

    // Init and destroy
    /*
    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside startup");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside cleanup");
    }
     */

    // Setter and Construction injection
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    */

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
        return fortuneService.getFortune();
    }

}
