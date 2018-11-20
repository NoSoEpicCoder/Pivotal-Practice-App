package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PALPracticeApp {
    public static void main(String[] args){
        SpringApplication.run(PALPracticeApp.class, args);
    }

    @Bean
    public TimeEntryRepository timeEntryRepository(){
        return new InMemoryTimeEntryRepository();
    }
}
