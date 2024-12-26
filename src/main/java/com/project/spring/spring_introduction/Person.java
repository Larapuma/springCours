package com.project.spring.spring_introduction;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//
//        System.out.println("Class Person: set pet");
//
//        this.pet = pet;
//    }
    Person(){
        System.out.println("Class Person: set pet");
    }
    //pet -> setPet
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my Pet!");
        pet.say();
    }
}
