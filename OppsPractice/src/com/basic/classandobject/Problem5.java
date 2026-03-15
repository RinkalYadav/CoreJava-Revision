package com.basic.classandobject;
class Student2{
	private String name;
	private int marks;
	 void setData(String name, int marks) {
		 this.name=name;
		 this.marks=marks;
	 }
	 void display() {
		 System.out.println("Student name is "+name+" and marks is "+marks);
		 
	 }
}
public class Problem5 {
public static void main(String[] args) {
	Student2 obj=new Student2();
	obj.setData("Rinkal", 85);
	obj.display();
}
}
