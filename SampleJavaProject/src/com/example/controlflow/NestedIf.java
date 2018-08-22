package com.example.controlflow;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 15)
		{
			System.out.println("Num is smaller than 15");
			if(num < 12)
			{
				System.out.println("Num is smaller than 12 too");
			}
		}else {
			System.out.println("Num is greater than 15");
		}
	}

}
