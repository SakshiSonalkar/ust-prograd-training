package com.example.AOPdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private int age;
    private String name;


    public void setDetails(int age,String name){
        setAge(age);
        setName(name);
        show();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("inside void show");

    }
    public void shown(int count){
        System.out.println("Inside void Shown function");
    }

    public void showDetails(){
        System.out.println("Name-> " + getName());
        System.out.println("Age-> " + getAge());
    }



}
