package com.project.spring.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {

        System.out.println("Бин человека появился!");

        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
