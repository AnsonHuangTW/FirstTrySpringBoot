package com.example.FirstTrySpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test-page")
    public String TestForShowText(){
        return "Hello Spring Boot";
    }

}
