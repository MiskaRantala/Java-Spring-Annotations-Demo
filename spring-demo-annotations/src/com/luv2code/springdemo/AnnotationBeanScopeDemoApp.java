package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are same
        boolean result = (theCoach == alphaCoach);

        System.out.println("They are same object? " + result);
        System.out.println("TheCoach's memory location is " + theCoach);
        System.out.println("AlphaCoach's memory location is " + alphaCoach);

        // close the context
        context.close();

    }

}
