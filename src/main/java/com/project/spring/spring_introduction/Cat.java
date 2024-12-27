package com.project.spring.spring_introduction;

import org.springframework.stereotype.Component;
// scope по умолчанию здесь singleton
// айди можно не указывать, тогда по дефолту
// айди будет такой же, как имя класса, только с маленькой буквы
@Component("catBean") // в скобках айди бина
public class Cat implements Pet{
    Cat(){
        System.out.println("Бин кошки появился!");
    }
    @Override
    public void say(){
        System.out.println("Mow-mow");
    }
}
