package com.project.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
    Dog mydog =context.getBean("myPet",Dog.class);

    mydog.say();
    Dog yourDog = context.getBean("myPet",Dog.class);
    yourDog.say();

    context.close();

    }

}
