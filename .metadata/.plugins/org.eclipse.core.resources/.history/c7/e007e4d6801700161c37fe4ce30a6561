package com.collabration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		FlowerDetail fd=(FlowerDetail) ctx.getBean("flDetail");// getting flower detail
		System.out.println(fd.getFl().toString());
	}

}
