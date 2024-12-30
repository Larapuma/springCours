package aop;


import org.springframework.stereotype.Component;

import java.util.List;
@Component("libBean")
public class Library {
    public void getBook(){
        System.out.println("Книга была взята. ");
    }
}
