package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context1=new ClassPathXmlApplicationContext("spring.xml");
			Student student=(Student)context1.getBean("s");
			System.out.println("Student data>>"+student); 
	
}
}
