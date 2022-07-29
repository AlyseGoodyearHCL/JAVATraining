package com.alyse.controller.Day9;
//writing binary data into file

import java.io.*;

public class Number2 {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			Reader reader = new FileReader("C:\\alyse\\test\\test.txt");
			br = new BufferedReader(reader);
			String line = null;
			
			File outFile = new File("C:\\alyse\\test\\test2.txt");
			Writer writer = new FileWriter(outFile);
			bw = new BufferedWriter(writer);
			
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.flush();
			}
			System.out.println("File Created");
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
