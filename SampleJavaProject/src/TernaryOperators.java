import java.util.Scanner;

public class TernaryOperators {
	
	/*
	 * variable num1 = (expression)? value if true: value if false*/
	public static void main(String[] args) {
//		int num1, num2;
//		num1 = 25;
//		num2 = (num1 == 10) ? 100: 200;
//		System.out.print(num2);
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		int bigger = (num1 > num2) ? num1: num2;
		int smaller = (num1 < num2) ? num1: num2;
		
		int min = (smaller < num3)? smaller: num3;
		int max = (bigger > num3)? bigger: num3;
		System.out.println(max + " " + min);
	}

}
