package com.basic.classandobject;
abstract class Employee6{
	private int id;
	private String name;
	private double salary;
	
	public Employee6(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	double getSalary() {
		return salary;
	}
	
	abstract double calculateBonus();
}
interface Taxable{
	public double calculateTax();
}

class FullTimeEmployee extends Employee6 implements Taxable{ 
	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}
	@Override
	public double calculateBonus() {
		return getSalary()*10/100;
	}
	@Override
	public double calculateTax() {
		return getSalary()*10/100;
	}
}
class PartTimeEmployee extends Employee6 implements Taxable{
	public PartTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}
	@Override
	public double calculateBonus() {
		return getSalary()*10/100;
	}
	@Override
	public double calculateTax() {
		return getSalary()*10/100;
	}
}
public class Problem13 {
public static void main(String[] args) {
	Employee6 ob1=new FullTimeEmployee(1,"Rinkal",2000);
	Employee6 ob2=new PartTimeEmployee(2,"Rajan",3000);
	
	System.out.println("Bonus FullTime: " + ob1.calculateBonus());
    System.out.println("Bonus PartTime: " + ob2.calculateBonus());
	
    Taxable t1 = (Taxable) ob1;
    Taxable t2 = (Taxable) ob2;

    System.out.println("Tax FullTime: " + t1.calculateTax());
    System.out.println("Tax PartTime: " + t2.calculateTax());
}
}
