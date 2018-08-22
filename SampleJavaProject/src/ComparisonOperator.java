import java.util.Scanner;

public class ComparisonOperator {

	/*
	 * Comparison operators
	 * ==, !=, <, >, <=, >=
	 * == returns true if both sides are equal
	 * != returns true if sides are not equal
	 * > greater than
	 * < less than
	 * >= greater than or equal
	 * <= less than or equal
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		System.out.println("Enter number");
		int num2 = sc.nextInt();
		if(num1 == num2)
		{
			System.out.println("== Num 1 and num2 are equal");
		}else {
			System.out.println("== Num 1 and num2 are not equal");
		}
		// !
		if(num1 != num2)
		{
			System.out.println("!= Num 1 and num2 are not equal TRUE");
		}else {
			System.out.println("!= Num 1 and num2 are equal");
		}
		// >
		if(num1 > num2)
		{
			System.out.println("> Num 1 is greater than num2");
		}else {
			System.out.println("> Num 1 is less than num2");
		}
		// <
		if(num1 < num2)
		{
			System.out.println("< Num 1 is less than num2");
		}else {
			System.out.println("< Num 1 is greater than num2");
		}
		// <=
		if(num1 <= num2)
		{
			System.out.println("<= Num 1 is less than or equal to num2");
		}else {
			System.out.println("<= Num 1 is greater than or equal to num2");
		}
		// >=
		if(num1 >= num2)
		{
			System.out.println(">= Num 1 is greater than or equal to num2");
		}else {
			System.out.println(">= Num 1 is less than or equal to num2");
		}

	}

}
