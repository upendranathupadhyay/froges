package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Message1 m1=(Message1) context.getBean("bean1");
	m1.message();
	}

}
