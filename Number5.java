package com.alyse.controller.Day3;

public class Number5 {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.drive();
		vehicle.stop();
	}

}

abstract class Vehicle{
	public void drive() {
		System.out.println("Driving");
	}
	public abstract void stop();
}

class Car extends Vehicle{
	public void stop() {
		System.out.println("Brake");
	}
}