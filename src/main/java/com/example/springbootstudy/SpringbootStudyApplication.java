package com.example.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringbootStudyApplication.class, args);
//        String[] names = run.getBeanDefinitionNames();
//        for (String name:names){
//            System.out.println(name);
//        }
    }

}
