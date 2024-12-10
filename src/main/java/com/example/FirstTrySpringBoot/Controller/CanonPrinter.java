package com.example.FirstTrySpringBoot.Controller;

import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {

    @Override
    public void print(String messager) {
        System.out.println("Canon Printer: " + messager);
    }
}
