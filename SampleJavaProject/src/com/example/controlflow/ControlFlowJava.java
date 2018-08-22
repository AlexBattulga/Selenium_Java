package com.example.controlflow;

public class ControlFlowJava {

	/*
	 * If statement
	 * if(condition)
	 * statement()
	 * nested if statements
	 * statement within statement
	 * 
	 * if else statement*/
	
	public static void main(String[] args) {
		int num = 70;
		if(num < 100) 
		{
			System.out.println("number is less than 100");
			if(num > 50)
			{
				System.out.println("number is greater than 50");
			}
		}else {
			System.out.println("number is greater than 100");
		}
	}
}
