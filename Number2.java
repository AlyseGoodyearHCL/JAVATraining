package com.alyse.controller.Day3;

public class Number2 {
	//overloading
	public int add(int i, int j) {
		return (i + j);
	}
	
	public int add(int i, int j, int k) {
		return (i + j + k);
	}
	
	public double add(double i, double j) {
		return (i + j);
	}
	
	public static void main(String args[]) {
		Number2 ob = new Number2();
		int add1 = ob.add(10, 15);
		System.out.println(add1);
		int add2 = ob.add(10, 15, 20);
		System.out.println(add2);
		double add3 = ob.add(10.3, 23.8);
		System.out.println(add3);
	}
}
