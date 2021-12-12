package com.abc.model;

import java.util.Scanner;

public class InterfaceTest extends MyCalculator{
	public static void main(String[] args) {
		System.out.println("Interface");
		System.out.println("-----------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		MyCalculator cal=new MyCalculator();
		cal.sum(a, b);
		cal.sub(a, b);
		cal.mul(a, b);
		cal.div(a, b);
		sc.close();
	}

}
