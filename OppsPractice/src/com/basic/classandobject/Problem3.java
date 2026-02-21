package com.basic.classandobject;
class Employee2{
	private int id;
	private String name;
	private double salary;
	
	Employee2(int id, String name, double salary){
		this.id=id;
		this.name=name;
		if(salary>=0) {
			this.salary=salary;
			
		}
		else {
			this.salary=0;
			System.out.println("Invalid salary set to 0");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}
	
	void increaseSalary(double percent) {
		if(percent>0) {
			salary+=salary*percent/100;
		}
		else {
			System.out.println("Invalid percent");
		}
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("-------------------------");
	}

}
public class Problem3 {
public static void main(String[] args) {
	Employee2 o1=new Employee2(1,"Rinkal",5000);
	Employee2 o2=new Employee2(2,"Rajan",10000);
	
	o1.increaseSalary(10);
	o2.increaseSalary(5);
	
	o1.display();
	o2.display();
	
}
}
