package com.alyse.controller.Day4;
//string buffer

public class Number2 {
	public static void main(String[] args) {
		StringBuffer strb = new StringBuffer("Hello, my name is Alyse");
		
		System.out.println(strb);
		System.out.println(strb.append(" Goodyear."));
		
		System.out.println(strb.capacity());
		System.out.println(strb.length());
		System.out.println(strb.insert(10, "first "));
		System.out.println(strb.delete(10, 16));
		System.out.println(strb.reverse());
	}
}
