package com.example.oop;

public class TechnicalDept extends Teachers {

	public static void main(String[] args) {
		TechnicalDept obj = new TechnicalDept();
		obj.dept_name = "Technical";
		System.out.println(obj.name + " "+ obj.dept_name);
	}

}
