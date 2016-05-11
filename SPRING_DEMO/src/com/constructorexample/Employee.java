package com.constructorexample;

public class Employee {
	private String ename;
	private String address;
	public Employee(String ename, String address) {
		super();
		this.ename = ename;
		this.address = address;
	}
	public void message()
	{
		System.out.println(this.ename+this.address);
	}
	
}
