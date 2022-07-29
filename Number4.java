package com.alyse.controller.Day9;
//writing to text file using char file

import java.io.*;

public class Number4 {

	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("C:\\alyse\\test\\test.txt");
			out = new FileWriter("C:\\alyse\\test\\test2.txt");
			
			int a = 0;
			
			while ((a = in.read()) != -1) {
				out.write(a);
			}
			System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
