import java.util.Scanner;

public class JavaOperators {

	public static void main(String[] args) {
		// +, =, *, /, %
		// Java operators
		// 1. Aritmatic operators
		// 2. Assigned operators
		// 3. Auto-increments
		// 4. Logical
		// 5. Comparison(Relational)
		// 6. Ternary
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any number");
		int num1 = sc.nextInt();
		System.out.println("Input number agian");
		int num2 = sc.nextInt();
		sc.close();
		num2 = num1;
		System.out.println("=Output: " + num2);
		num2 += num1;
		System.out.println("+=Output: " + num2);
		num2 -= num1;
		System.out.println("-=Output: " + num2);
		num2 *= num1;
		System.out.println("*=Output: " + num2);
		num2 /= num1;
		System.out.println("/=Output: " + num2);
		num2 %= num1;
		System.out.println("%=Output: " + num2);
		
	}

}
