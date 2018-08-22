package com.example.oop;

public class Student extends Person {
	
	public static void main(String arg[])
	{
		Person obj = new Student();
		obj.setName("Tony");
		obj.setAddress("9988 Main St");
		obj.setAge(21);
		obj.setSSN(879908778);
		System.out.println("Name is: "+obj.getName());
		System.out.println("Address is: "+obj.getAddress());
		System.out.println("Age is: "+obj.getAge());
		System.out.println("SSN number is: "+obj.getSSN());
	}
}
