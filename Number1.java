package com.alyse.controller.Day5;
import java.io.*;

//checked exception

public class Number1 {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
        fileInput.close();
		
	}

}
