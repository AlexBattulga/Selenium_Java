package com.example.controlflow;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0)
		{
			System.out.println("num is negative");
		}else{
			System.out.println("num is positive");
		}
	}
}
