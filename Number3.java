package com.alyse.controller.Day9;
//reading text file using char stream

import java.io.*;

public class Number3 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\alyse\\test\\test.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String st;
	    
	    while ((st = br.readLine()) != null) {
	    	System.out.println(st);
	    }
	}
}
