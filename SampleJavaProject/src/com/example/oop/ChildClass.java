package com.example.oop;

public class ChildClass extends ParentClass {

	public ChildClass()
	{
		System.out.println("Constructor of Child");
	}
	
	void Description()
	{
		System.out.println("Child Method");
		super.Description();
	}
	public static void main(String[] args) {
		ChildClass sc = new ChildClass();
		sc.Description();
	}

}
