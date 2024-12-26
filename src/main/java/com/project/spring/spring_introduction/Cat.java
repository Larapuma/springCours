package com.project.spring.spring_introduction;

public class Cat implements Pet{
    Cat(){
        System.out.println("Бин кошки появился!");
    }
    @Override
    public void say(){
        System.out.println("Mow-mow");
    }
}
