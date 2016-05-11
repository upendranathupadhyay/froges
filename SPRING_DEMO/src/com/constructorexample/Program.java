package com.constructorexample;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1=(Employee) context.getBean("emp1");
         emp1.message();
	}

}
