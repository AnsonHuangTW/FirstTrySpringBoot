package com.example.FirstTrySpringBoot.Controller;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(* com.example.FirstTrySpringBoot.Controller.HpPrinter.*(..))")
//    public void before(){
//        System.out.println("Ths is before.");
//    }

    @Around("execution(* com.example.FirstTrySpringBoot.Controller.HpPrinter.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Date start = new Date();
        System.out.println("I'm around before");

        Object obj = pjp.proceed();

        Date end = new Date();
        System.out.println("I'm around after");
        long timeCost = end.getTime() - start.getTime();

        System.out.println("Function cost time: " + timeCost + " ms");
        return obj;
    }



}
