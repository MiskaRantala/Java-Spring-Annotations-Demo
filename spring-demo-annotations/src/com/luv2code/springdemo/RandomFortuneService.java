package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @PostConstruct
    public void doMyStartup() {
        System.out.println("Beep bop. Activating bzzt!");
    }

    //read the file
    private String fileName = "/Users/miska/IdeaProjects/spring-demo-annotations/src/fortune.properties";

    // create a list
    private List<String> data;

    //create a random number generator
    private Random randomFortune = new Random();

    public RandomFortuneService() {

        File theFile = new File(fileName);

        // initialize array list
        data = new ArrayList<String>();

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                data.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    // picks a random string from the array
    @Override
    public String getFortune () {

        int random = randomFortune.nextInt(data.size());

        String theFortune = data.get(random);

        return theFortune;
    }

    @PreDestroy
    public void doMyCleanup() {
        System.out.println("Beep bop. Sending results and destroying the bean. ");
        System.out.println("Bye bye, bean!");
    }

}

