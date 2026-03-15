package com.basic.classandobject;
class Person3{
	private String name;
	private int age;
	
	public Person3(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayPersonDetails() {
		System.out.println("Name is " + name + " and age is " + age);
	}
}

class Employee5 extends Person3{
	private int emId;
	private double salary;
	
	
	public Employee5(String name, int age, int emId, double salary) {
		super(name, age);
		this.emId=emId;
		this.salary=salary;
	}
	
	public void increaseSalary(double percentage) {
		salary+=salary*percentage/100;
	}
	public void displayEmployeeDetails() {
		super.displayPersonDetails();
		System.out.println("employee id is "+emId+" and salary is "+salary);
	}
}

public class Problem9 {
public static void main(String[] args) {
	Employee5 ob=new Employee5("Rinkal",22,1,20000);
	ob.increaseSalary(10);
	ob.displayEmployeeDetails();
}
}
