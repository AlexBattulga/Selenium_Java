package com.example.controlflow;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
}
