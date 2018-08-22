package com.example.practice;
// Method overload vs Method Override
public class MethodOverLoad {
	public void disp(char c)
	{
		System.out.println(c);
	}
	// This is method overloading
	public void disp(char c, int a)
	{
		System.out.println(c);
	}
	public static void main(String arg[])
	{
		MethodOverLoad obj = new MethodOverLoad();
		obj.disp('a');
		obj.disp('a', 9);
	}
}
