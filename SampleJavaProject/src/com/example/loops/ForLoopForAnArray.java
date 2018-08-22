package com.example.loops;

import java.util.Scanner;

public class ForLoopForAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [] array = {10,23,35};
		int factorial = 1;
//		String []strArray = {"Test", "Code", "Java"};
//		System.out.println(array.length); // size of the array
//		for(int i = 0; i < strArray.length; i++)
//		{
//			System.out.println(strArray[i]);
//		}
//		// for each loop
//		for(int i: array)
//		{
//			System.out.println(i);
//		}
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}

}
