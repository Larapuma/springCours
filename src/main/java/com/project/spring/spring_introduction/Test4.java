package com.project.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet",Dog.class);
        Dog yourDog = context.getBean("myPet",Dog.class);
        System.out.println(myDog.equals(yourDog) & myDog==yourDog);
        myDog.setName("Strelka");
        yourDog.setName("Belka");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
        System.out.println(myDog.equals(yourDog));
        context.close();

    }
}
