package com.abc.model;

class Cars{
	void move() {
		System.out.println("Move...");
	}
	void brake() {
		System.out.println("Break...");
	}
}

class Audi extends Cars{
	void move() {
		System.out.println("Move2...");
	}
	void autoPilot() {
		System.out.println("AutoPilot...");
	}
	void autoGear() {
		System.out.println("AutoGear...");
	}
}

public class Tests {
	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		System.out.println("-----------------------");
		Audi audi=new Audi();
		audi.move();
		audi.brake();
		audi.autoPilot();
		audi.autoGear();
	}

}
