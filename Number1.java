package com.alyse.controller.Day2;

public class Number1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		boolean a = true;
		boolean b = false;
		
		//unary
		System.out.println(i);
		System.out.println(j);
		
		//arithmetic
		System.out.println("Addition: " + (i + j));
		System.out.println("Subtraction: " + (j - i));
		
		//relational
		System.out.println(i == j);
		System.out.println(i < j);
		
		//logical
		System.out.println(a && b);
		System.out.println(a == !b);
	}

}
