package com.alyse.controller.Day5;

import java.io.*;

//exception with throws

public class Number3 {

	public static void main(String[] args) throws IOException {
	    BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"));
	    bw.write("Test");
	    bw.close();
	}
}
