package com.abc.model;

abstract class Bank{
	public abstract void openAccount();
	public abstract void closeAccount();
}

class SBI extends Bank{
	public void openAccount() {
		System.out.println("Account was opened...");
	}
	public void closeAccount() {
		System.out.println("Account was closed...");
	}
	
}

public class BankTest {
	public static void main(String[] args) {
		System.out.println("Abstract class");
		System.out.println("---------------");
		SBI sbi=new SBI();
		sbi.openAccount();
		sbi.closeAccount();
	}

}
