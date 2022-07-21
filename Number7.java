package com.alyse.controller.Day3;
//super keyword

public class Number7 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v.getDetails());
	}
}

class Car {
	Car(String dept){
		this.dept = dept;
	}
	
	public String name = "Nissan";
	
	public Long miles = 67895678L;
	
	public String dept;
	
	public String getDetails() {
		return name + " " + miles + " " + dept;
	}
}

class Vehicle extends Car{
	Vehicle(){
		super("Model");
	}
	
	public String role = "car_make";
	
	public String getDetails() {
		String name = super.getDetails();
		return name + " " + role;
	}
}
