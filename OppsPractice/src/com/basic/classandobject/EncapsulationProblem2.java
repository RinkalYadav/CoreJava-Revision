package com.basic.classandobject;
class Employee{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}
		else {
			System.out.println("Invalid id");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
		if(salary>=10000) {
			this.salary = salary;
		}
		else {
			System.out.println("Invalid salary");
		}
		
	}
	
	
}
public class EncapsulationProblem2 {
public static void main(String[] args) {
	Employee o=new Employee();
	o.setId(1);
	o.setName("Rinkal");
	o.setSalary(20000);
	
	System.out.println("Id id "+o.getId());
	System.out.println("Name is "+o.getName());
	System.out.println("Salary is "+o.getSalary());
}
}
