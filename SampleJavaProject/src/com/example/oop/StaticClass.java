package com.example.oop;

public class StaticClass {
	
	static int num;
	static String str;
	static String str2;
	static String str3;
	static 
	{
		num = 90;
		str = "Some static values";
		str2 = "Hello";
		str3 = "World";
	}
	public static void main(String[] args)
	{
		// Static block examples
		System.out.println(num);
		System.out.println(str);
		// Declare two String values print the static method
		// must create 1 static method and call it inside the main
		//Test();
	}
	public static void Test()
	{
		System.out.println(str2);
		System.out.println(str3);
	}
}
