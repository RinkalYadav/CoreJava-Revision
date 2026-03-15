package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to divede 100");
    int n=sc.nextInt();
    
    try {
    	double d=(double) 100/n;
    	System.out.println(d);
    }
    catch(ArithmeticException e) {
    	System.out.println("Invalid Number");
    }
    finally {
    	System.out.println("Program Completed ");
    }
}
}
