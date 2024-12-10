package com.example.FirstTrySpringBoot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

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
    }
}
