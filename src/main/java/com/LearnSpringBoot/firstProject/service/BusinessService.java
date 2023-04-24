package com.LearnSpringBoot.firstProject.service;

import org.springframework.stereotype.Component;

import com.LearnSpringBoot.firstProject.model.HelloWorld;

@Component
public class BusinessService {
    public HelloWorld getHelloWorld(){
        HelloWorld hello1=new HelloWorld();
        return hello1;
    }
}
