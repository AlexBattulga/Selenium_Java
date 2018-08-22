import java.util.Scanner;

public class SumOfTheNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int var1 = sc.nextInt();
		sc.close();
		int sum = var + var;
		System.out.println("Sum of two input is: "+sum);
		int subtract = var - var1;
		System.out.println("Subtracting two inputs: "+subtract);
		int multi = var * var1;
		System.out.println("Mulpitlication two inputs: "+multi);
		double divide = var / var1;
		System.out.println("Dividing two inputs: "+divide);
	}

}
