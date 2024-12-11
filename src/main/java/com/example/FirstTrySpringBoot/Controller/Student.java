package com.example.FirstTrySpringBoot.Controller;

public class Student {
    private String strName;
    private int age;

    public void setName(String name){
        this.strName = name;
    }
    public String getName(){
        return strName;
    }
}
