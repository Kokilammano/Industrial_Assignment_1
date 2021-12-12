package com.abc.model;

class Engine{
	 int engineNumber;
	 int mftYear;
	 String company;
	
	Engine(int engineNumber,int mftYear,String company){
		this.engineNumber=engineNumber;
		this.mftYear=mftYear;
		this.company=company;
	}

	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", mftYear=" + mftYear + ", company=" + company + "]";
	}
	
	
}

class Car{
	int modelNo;
	String mftYear;
	Engine engine;
	
	Car(int modelNo,String mftYear,Engine engine){
		this.modelNo=modelNo;
		this.mftYear=mftYear;
		this.engine=engine;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", mftYear=" + mftYear + ", engine=" + engine + "]";
	}
	
}
public class Test {
	public static void main(String[] args) {
		Engine engine=new Engine(101,2021,"Honda");
		Car car=new Car(200,"2020",engine);
		System.out.println(car);
	}

}
