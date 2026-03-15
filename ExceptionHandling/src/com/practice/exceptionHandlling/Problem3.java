package com.practice.exceptionHandlling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class Problem3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	try {
		if(age<18) {
			throw new InvalidAgeException("age must be 18+");
		}
		System.out.println("Eligble to vote");
	}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
		
	}
}
}
