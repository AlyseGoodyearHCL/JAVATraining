package com.alyse.controller.Day3;

public class Number3 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(1, "car");
		System.out.println(v);
	}

}

class Vehicle{
	private int num;
	private String name;
	Vehicle(int num, String name){
		this.num = num;
		this.name = name;
	}
}
