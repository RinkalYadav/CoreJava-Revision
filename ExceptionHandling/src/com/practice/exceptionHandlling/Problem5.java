package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number ");
    int n1=sc.nextInt();
    System.out.println("Enter second number ");
    int n2=sc.nextInt();
    
    try {
    	double d=n1/n2;
    	System.out.println(d);
    }
    catch(ArithmeticException e){
    	System.out.println("Invalid division");
    }
    System.out.println("Program finished");
}
}
