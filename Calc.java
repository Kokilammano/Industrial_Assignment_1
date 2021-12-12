package com.abc.model;

public interface Calc {
	static void sum(int a,int b) {
		System.out.println("The sum of " +a+" and " +b+ " is " +(a+b));
	}
	static void sub(int a,int b) {
		System.out.println("The subtraction of " +a+" and " +b+ " is " +(a-b));
	}
	static void mul(int a,int b) {
		System.out.println("The multiplication of " +a+" and " +b+ " is " +(a*b));
	}
	static void div(int a,int b) {
		System.out.println("The division of " +a+" and " +b+ " is " +(a/b));
	}
}
