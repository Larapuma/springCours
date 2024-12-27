package com.project.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    Dog(){
        System.out.println("Бин собаки появился!");
    }
    @Override
    public void say(){
        System.out.println("Wow-Wow!");
    }
    @PostConstruct
    private void init(){
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    private void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
