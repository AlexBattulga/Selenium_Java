package com.example.loops;

import java.util.Scanner;

public class LoopsInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int input = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i=input; i>=1; i--)
		{
			sum += i;
			System.out.println(sum);
		}
		System.out.println("Total is: " + sum);
	}
}
