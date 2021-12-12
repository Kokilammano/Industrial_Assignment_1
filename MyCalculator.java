package com.abc.model;

public class MyCalculator implements Calculator {

	@Override
	public void sum(int a, int b) {
		System.out.println("Addition of " +a +" and " +b +" is " +(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction of " +a +" and " +b +" is " +(a-b));		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication of " +a +" and " +b +" is " +(a*b));		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division of " +a +" and " +b +" is " +(a/b));		
	}
	
}
