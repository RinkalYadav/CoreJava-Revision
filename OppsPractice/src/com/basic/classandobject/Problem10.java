package com.basic.classandobject;
class Animal{
	public void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}
public class Problem10 {
public static void main(String[] args) {
	Animal ob=new Dog();
	ob.makeSound();
}
}
