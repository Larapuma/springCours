package com.project.spring.spring_introduction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // создал контейнер

        Pet pet  = context.getBean("myPet", Pet.class);// рефлексия???
        pet.say();
        context.close();
    }
}
