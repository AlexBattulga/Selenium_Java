package com.example.loops;

public class WhileLoop {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =1;
		int i = 1;
		while(i <= 7)
		{
			System.out.println(num1 +" ");
			int sumOftwo = num1 + num2;
			num1 = num2;
			num2 = sumOftwo;
			i++;
		}

	}

}
