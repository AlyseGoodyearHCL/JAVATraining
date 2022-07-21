package com.alyse.controller.Day3;
//method overriding

class Car{
	float getMiles() {
		return 10000.0f;
	}
}

class CarA extends Car{
	float getMiles() {
		return 200;
	}
}

class CarB extends Car{
	float getMiles() {
		return 709863;
	}
}

class CarC extends Car{
	
}

public class Number4 {
	
	public static void main(String[] args) {
		CarC c = new CarC();
		System.out.println(c.getMiles());
		
		Car a = new CarB();
		System.out.println(a.getMiles());
	}

}
