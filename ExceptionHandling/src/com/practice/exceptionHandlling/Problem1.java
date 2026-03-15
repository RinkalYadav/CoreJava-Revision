package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a two integer value ");
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	try {
		double divide=n/m;
		System.out.println("Result "+divide);
	}
	catch(ArithmeticException e) {
		System.out.println("Can not divide by zero ");
	}
	sc.close();
}
}
