package com.example.AOPdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    private long phoneNumber;

    @Autowired
    private Person person;

    public void setPhoneDetails(long phoneNumber){
        setPhoneNumber(phoneNumber);
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayPhoneNumber(){
        System.out.println("inside Class Phone method-displayPhoneNumber");
        System.out.println(getPhoneNumber());
    }

    public void display(){
        System.out.println("inside Class Phone method-display");
        person.showDetails();
        displayPhoneNumber();
    }
}
