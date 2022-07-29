package com.alyse.controller.Day9;
//serialization and store in file

import java.io.*;

public class Number6 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(2, "72829", "car", 5);
		
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		try {
			fs = new FileOutputStream("C:\\alyse\\test\\test.txt");
			os = new ObjectOutputStream(fs);
			os.writeObject(v);
			System.out.println("Complete");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	
	class Vehicle implements Serializable {
		
		private static final long serialVersionUID = 678678;
		private int vin;
		private String car;
		private transient String make;
		private int lot;
		
	}

}
