package com.abc.model;

class TV{
	void sound() {
		System.out.println("TV...");
	}
	void picture() {
		System.out.println("Picture...");
	}
}

class ThreeDTV extends TV{
	void threeD() {
		System.out.println("Three DTV...");
	}
	void dolbyAudio() {
		System.out.println("Dolby Audio...");
	}
}

class SmartTV extends ThreeDTV{
	void internet() {
		System.out.println("Internet...");
	}
	void fullHD() {
		System.out.println("Full HD...");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		System.out.println("MultiLevel Inheritance");
		System.out.println("-----------------------------");
		SmartTV smart=new SmartTV();
		smart.sound();
		smart.picture();
		smart.threeD();
		smart.dolbyAudio();
		smart.internet();
		smart.fullHD();
	}

}
