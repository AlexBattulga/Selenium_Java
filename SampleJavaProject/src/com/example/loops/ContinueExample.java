package com.example.loops;

public class ContinueExample {

	public static void main(String[] args) {
		for(int j = 0;  j <= 6; j++)
		{
			if(j == 3)
			{
				continue; // skipping 3 and contuning loop "break;" will stop the loop at 3
			}
			System.out.println(j);
		}
		int counter = 10;
		System.out.println("This is a while loop running");
		while(counter >= 0)
		{
			if(counter == 7)
			{
				counter--;
				continue;
			}
			System.out.println(counter + " ");
			counter--;
		}
	}

}
