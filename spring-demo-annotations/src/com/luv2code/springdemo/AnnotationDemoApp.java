package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean fHappyFortuneServicerom spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theDance = context.getBean("breakdanceCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// System.out.println(theDance.getDailyVideo());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();


	}

}
