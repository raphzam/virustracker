package com.example.coronavirustracker11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTracker11Application {

    public static void main(String[] args) {
        SpringApplication.run(CoronavirusTracker11Application.class, args);
    }

}
