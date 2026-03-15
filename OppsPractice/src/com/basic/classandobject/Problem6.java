package com.basic.classandobject;
class Car{
	private String brand;
	private double price;
	
	public void setDetails(String brand, double price) {
		this.brand=brand;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Car brand is "+brand+" and price is "+price);
	}
	public void increasePrice(double amount) {
		price+=amount;
	}
}
public class Problem6 {
public static void main(String[] args) {
	Car obj=new Car();
	obj.setDetails("Honda", 150000.78);
	obj.increasePrice(2000);
	obj.displayDetails();
}
}
