package com.project.spring.spring_introduction;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBin")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Person(Pet pet){
//        System.out.println("Person bin is created");
//        this.pet = pet;
//    }
    public void setSurname(String surname) {
        System.out.println("Class Person: set surname.");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age.");
        this.age = age;
    }

    Person(){
        System.out.println("Person is created");
    }

    //pet -> setPet
    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person: set pet");
    }
    public String getSurname() {
        return surname;
    }

    public void callYourPet(){
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
