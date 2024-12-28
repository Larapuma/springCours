package com.project.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")

//@ComponentScan("com.project.spring.spring_introduction")
public class  MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    @Scope("singleton")
    public Person personBean(){
        return new Person(catBean());
    }





}
