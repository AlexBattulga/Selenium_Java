package com.example.try_catch;

import java.io.IOException;

// Example of throws
class ThrowExample{
	void myMethod(int num) throws IOException, ClassNotFoundException{
		if(num == 1)
			throw new IOException("IOException Occured");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}
public class ThrowsNewExceptionExample {
	public static void main(String arg[])
	{
		try {
			ThrowExample obj = new ThrowExample();
			obj.myMethod(2);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


