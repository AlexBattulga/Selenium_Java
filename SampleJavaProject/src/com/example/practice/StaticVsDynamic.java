package com.example.practice;

	class Animal
	{
		public void walk()
		{
			
			System.out.println("Animal walks");
		}
	}
	public class StaticVsDynamic extends Animal{
	
	public void walk()
	{
		System.out.println("Cat walks");
	}
	public static void main (String arg[])
	{
		Animal obj1 = new StaticVsDynamic();
		obj1.walk();
		Animal obj2 = new Animal();
		obj1.walk();
	}
}
