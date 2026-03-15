package com.basic.classandobject;
abstract class Shape{
	public abstract double calculateArea();
}
class Circle extends Shape{
	private double redius;
	
	public Circle(double radius){
		this.redius=radius;
	}
	@Override
	public double calculateArea() {
		return Math.PI*redius*redius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double calculateArea() {
		return length*width;
	}
}
public class Problem11 {
public static void main(String[] args) {
	Shape s1=new Circle(5);
	Shape s2=new Rectangle(4,6);
	
	System.out.println(s1.calculateArea());
	System.out.println(s2.calculateArea());
}
}
