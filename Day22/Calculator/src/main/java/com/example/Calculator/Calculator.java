package com.example.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Value("${num1}")
    public double num1;
    @Value("${num2}")
    public double num2;

    public double addition(){
        return num1 + num2;
    }

    public double subtraction(){
        return num1-num2;
    }

    public double multiplication(){
        return num1*num2;
    }

    public double division(){
            return num1/num2;
        }

}
