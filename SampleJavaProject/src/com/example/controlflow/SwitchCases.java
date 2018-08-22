package com.example.controlflow;

import java.util.Scanner;

public class SwitchCases {

	/*
	 * Switch statement
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isVowel = false;
		char str = sc.next().charAt(0);
		sc.close();
		switch(str)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}
		if(isVowel == true)
		{
			System.out.println(str + " is Vowel");
		}else {
			if((str >= 'a' && str <= 'z') || (str >= 'A' && str <= 'Z'))
				System.out.println(str + " is a Constant");
			else
				System.out.println(" Input is not an alphabet ");
		}
	}

}
