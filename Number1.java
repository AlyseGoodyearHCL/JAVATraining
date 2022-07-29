package com.alyse.controller.Day9;
//reading binary file

import java.io.*;

public class Number1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter age: ");
			String age = br.readLine();
			System.out.println("Age: " + age);
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
