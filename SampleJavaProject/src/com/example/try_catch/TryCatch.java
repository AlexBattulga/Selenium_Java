package com.example.try_catch;

public class TryCatch {

	public static void main(String[] args) {
		// Try catch exception
		int num1;
		int num2;
//		try {
//			num1 = 0;
//			num2 = 20/num1;
//			System.out.println(num2);
//		}catch(Exception e)
//		{
//			System.out.println("Error dividing numbers");
//		}
//		try {
//			String str = null;
//			System.out.println(str.length());
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Error dividing numbers");
//		}catch(Exception e)
//		{
//			System.out.println("Something happend...");
//		}
		try {
//			num1 = 0;
//			num2 = 20/num1;
//			System.out.println(num2);
			int arr[] = new int[7];
			arr[10] = 10/5;
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException e)
		{
			System.out.println("Error dividing numbers");
		}catch(NullPointerException a)
		{
			System.out.println("Null Pointer error");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit");
		// finally will always print
		}finally {
			System.out.println("Couldn't identify this error with exception");
		}
		// out of try-catch, so it will always execute
		System.out.println("Out of try-catch-finally");
	}

}
