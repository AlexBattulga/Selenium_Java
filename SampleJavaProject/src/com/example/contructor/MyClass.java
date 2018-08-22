package com.example.contructor;

public class MyClass {

	String name;
	public MyClass()
	{
		this.name = "Java Class";
	}
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.name);
	}

}
