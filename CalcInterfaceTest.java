package com.abc.model;

public class CalcInterfaceTest {

	public static void main(String[] args) {
		System.out.println("Interface with static methods");
		System.out.println("------------------------------");
		Calc.sum(10, 5);
		Calc.sub(10, 5);
		Calc.mul(10, 5);
		Calc.div(10, 5);
	}

}
