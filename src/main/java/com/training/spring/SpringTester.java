package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		Person p1 = (Person)context.getBean("person");
		System.out.println(p1.getFirstName() + " " + p1.getAge());
		
//		Car c1 = (Car)context.getBean("car");
//		System.out.println(c1.getMake());
		System.out.println(p1.getCarDetails());
	}

}
