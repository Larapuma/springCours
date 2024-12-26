package com.project.spring.spring_introduction;

import lombok.Getter;

public class Person {
    private Pet pet;
    private String surname;
    private int age;



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
        System.out.println("Class Person: set pet");
    }
    //pet -> setPet
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public String getSurname() {
        return surname;
    }

    public void callYourPet(){
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
