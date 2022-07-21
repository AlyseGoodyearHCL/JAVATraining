package com.alyse.controller.Day3;
//interface

public class Number6 {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.drive();
		v.stop();
	}
}

interface Vehicle{
	public abstract void drive();
	void stop();
}

class Truck implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Driving Truck");
	}
	@Override
	public void stop() {
		System.out.println("Stop Car");
	}
}

class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Driving car");
	}
	@Override
	public void stop() {
		System.out.println("stop car");
	}
}