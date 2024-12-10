package com.example.FirstTrySpringBoot.Controller;

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

    @Override
    public void print(String messager) {
        System.out.println("HP Printer: " + messager);
    }
}
