package com.alyse.controller.Day4;
//integer array

public class Number4 {
	
	public static void main(String[] args) {
		//even numbers
		int intArr[] = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i = 0; i<intArr.length; i++) {
			if (intArr[i]%2 == 0) {
				sum += intArr[i];			
			}
		}
		System.out.println(sum);
		
		//odd numbers
		int intArr2[] = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum2 = 0;
		for(int i = 0; i<intArr.length; i++) {
			if (intArr[i]%2 == 1) {
				sum2 += intArr[i];			
			}
		}
		System.out.println(sum2);
		
	}
}
