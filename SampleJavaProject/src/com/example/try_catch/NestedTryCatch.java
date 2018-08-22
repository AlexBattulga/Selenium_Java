package com.example.try_catch;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = {1, 2, 3, 4};
					System.out.println(arr[10]);
					}catch(ArithmeticException e) {
						System.out.println("Arthimetic Exception");
						System.out.println("handled in try-block3");
					}
					}catch(ArithmeticException e) {
						System.out.println("Arthimetic Exception");
						System.out.println("handled in try-block2");
					}
					}catch(ArithmeticException e1) {
						System.out.println("Arthimetic Exception");
						System.out.println("handled in main try-block");
				}catch(IndexOutOfBoundsException e1) {
					System.out.println("Array index out of bounds exception");
					System.out.println("handled in main try-block2");
			}catch(Exception e2) {
				System.out.println("handled in main try-block2");
		}

	}

}
