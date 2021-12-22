package com.example.EmployeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class EmployeeDetailsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(EmployeeDetailsApplication.class, args);
        EmployeeOne employee = context.getBean(EmployeeOne.class);
		employee.details();
		int count =context.getBeanDefinitionCount();
		System.out.println(count);
		String[] name =context.getBeanDefinitionNames();
		Arrays.sort(name);
		for(String x:name){
			System.out.println(x);
		}
		}
	}


