package com.cydeo.bean_annotation.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {


    @Bean
    public String beanString(){
        return "Bean String";
    }

    @Bean
    public Integer beanInteger(){
        return 1234;
    }

}
