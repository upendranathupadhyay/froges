package com.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// program- to create a program which illustrate instance factory pattern
public class Program {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	
	DogBreed db=(DogBreed) ctx.getBean("dog");
	System.out.println(db.getDogname()+db.getBreed());
	}

}
