package com.basic.classandobject;
class Student{
	String name;
	int age;
	double marks;
	
	Student(){
		this("unknown",0,0);
	}
	Student(String name,int age){
		this(name,age,0);
		
	}
	Student(String name,int age,double marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	void display() {
		System.out.println(name+" "+age+" "+marks);
	}
}
public class Problem1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Rinkal", 22);
		Student s3 = new Student("Aman", 23, 88.5);
		
		s1.display();
		s2.display();
		s3.display();
	}
	
}
