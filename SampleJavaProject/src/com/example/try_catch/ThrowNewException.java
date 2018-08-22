package com.example.try_catch;

public class ThrowNewException {
	
	public static void checkEligibility(int stuAge, int stuWeight)
	{
		if(stuAge < 12 && stuWeight < 40)
		{
			throw new ArithmeticException("Student is not eligible");
		}else {
			System.out.println("Student entr valid");
		}
	}

	public static void main(String[] args) {
		checkEligibility(14, 45);

	}

}
