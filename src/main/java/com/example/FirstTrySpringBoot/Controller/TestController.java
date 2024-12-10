package com.example.FirstTrySpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Printer printer;

    @RequestMapping("/test-page")
    public String TestForShowText(){
        printer.print("Hello Word");
        return "Hello Spring Boot";
    }
}

