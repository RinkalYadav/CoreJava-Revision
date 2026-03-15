package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
    int age=sc.nextInt();
    
    try {
    	if(age<18) {
    		throw new ArithmeticException("Invalid age");
    	}
    	else {
    		System.out.println("Eligble to vote");
    	}
    }
    catch(ArithmeticException e) {
    	System.out.println(e);
    }
    finally {
    	System.out.println("Program completed");
    }
    sc.close();
}
}
