package com.example.AOPdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AoPdemoApplication {


	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AoPdemoApplication.class, args);
        Person person=context.getBean(Person.class);
		Phone phone=context.getBean(Phone.class);
		person.setDetails(16,"Shruti");
		phone.setPhoneDetails(999998888);
		person.shown(2);
		phone.display();

	}

}
