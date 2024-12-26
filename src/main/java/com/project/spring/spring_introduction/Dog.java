package com.project.spring.spring_introduction;


public class Dog implements Pet {
    Dog(){
        System.out.println("Бин собаки появился!");
    }
    @Override
    public void say(){
        System.out.println("Wow-Wow!");
    }
}
