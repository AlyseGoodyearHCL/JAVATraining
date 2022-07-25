package com.alyse.controller.Day5;
//unchecked exception using try/catch

public class Number2 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
        try {
        	System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
	}
}
