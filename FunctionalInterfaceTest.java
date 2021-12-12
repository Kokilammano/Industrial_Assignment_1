package com.abc.model;

@FunctionalInterface
interface FunInterface{
	public abstract void call();
	
	public default void hello() {
		System.out.println("Hello....");
	}
	
	public static void welcome() {
		System.out.println("Welcome....");
	}
	
}
class FuncInterface implements FunInterface{
	public void call() {
		System.out.println("Call...." );
	}
}

public class FunctionalInterfaceTest{
	public static void main(String[] args) {
		System.out.println("Functional Interface");
		System.out.println("---------------------");
		FunInterface fun=new FuncInterface();
		FunInterface.welcome();
		fun.hello();
		fun.call();
		
	}

	
}
