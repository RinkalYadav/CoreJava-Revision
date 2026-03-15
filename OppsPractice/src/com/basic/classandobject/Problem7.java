package com.basic.classandobject;
class Employee3{
	private int id;
	private String name;
	private double salary;
	

	
	Employee3(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void displayDetails() {
		System.out.println("Employe id is "+id+" and name is "+name+" and salary is "+salary);
	}
	void increaseSalary(double percentage) {
		salary+=(salary*percentage)/100;
	}
}
public class Problem7 {
public static void main(String[] args) {
	Employee3 obj=new Employee3(1,"Rinkal",150000);
	obj.increaseSalary(10);
	obj.displayDetails();
}
}
