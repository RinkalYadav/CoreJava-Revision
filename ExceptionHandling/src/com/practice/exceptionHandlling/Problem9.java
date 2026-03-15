package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int n=sc.nextInt();
    
    try {
    	int result = 20/n;
    	System.out.println("Result is "+result);
    }
    catch(ArithmeticException e) {
    	System.out.println("Invalid number");
    }
    finally {
    	System.out.println("Program finished ");
    }
}
}
