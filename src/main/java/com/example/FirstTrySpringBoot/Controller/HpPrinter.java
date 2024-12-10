package com.example.FirstTrySpringBoot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

    @Value("${count:30}")
    private int countFromProp;

    private int count;


    @PostConstruct
    public void init(){
//        init the count for bean
        count = 10;
    }



    @Override
    public void print(String messager) {
        count--;
        System.out.println("HP Printer: " + messager);
        System.out.println("Limit to print: " + count);
        System.out.println("Limit to print(Prop): " + countFromProp);
    }
}
