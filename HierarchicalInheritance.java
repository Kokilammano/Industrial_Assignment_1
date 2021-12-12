package com.abc.model;

class Employee{
	void getEmployeeName() {
		System.out.println("Get Employee Name");
	}
	void getEmployeeId() {
		System.out.println("Get Employee Id");
	}
}

class PermanentEmployee extends Employee{
	void salaryOnMonthly() {
		System.out.println("Salary on monthly");
	}
}

class ContractEmployee extends Employee{
	void salaryOnHourly() {
		System.out.println("Salary on hourly");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance");
		System.out.println("------------------------------");
		ContractEmployee ce=new ContractEmployee();
		ce.getEmployeeName();
		ce.getEmployeeId();
		ce.salaryOnHourly();
		
		PermanentEmployee pe=new PermanentEmployee();
		pe.salaryOnMonthly();
	}

}
