package com.example.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		System.out.println("8 + 2 = "+ calculator.addition());
		System.out.println("8 - 2 = "+ calculator.subtraction());
		System.out.println("8 * 2 = "+ calculator.multiplication());
		System.out.println("8 / 2 = "+ calculator.division());
	}

}
