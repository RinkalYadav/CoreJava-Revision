package com.basic.classandobject;
class Mobile{
	String brand;
	int price;
	void display() {
		System.out.println("brand name is "+brand+" price is "+price);
	}
}
public class Main {
public static void main(String[] args) {
	Mobile obj=new Mobile();
	Mobile obj2=new Mobile();
	obj.brand="samsung";
	obj.price=20000;
	obj2.brand="apple";
	obj2.price=50000;
	obj.display();
	obj2.display();
}
}

