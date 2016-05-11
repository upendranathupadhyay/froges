package com.gettersetterexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e.getEname()+e.getAddress());

	}

}
